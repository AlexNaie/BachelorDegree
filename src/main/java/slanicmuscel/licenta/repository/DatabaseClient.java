package slanicmuscel.licenta.repository;

import org.springframework.stereotype.Repository;
import slanicmuscel.licenta.model.*;

import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;

@Repository
public class DatabaseClient {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/licentadbv2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String pass = "Licenta123";

    private static Connection connection = null;

    public DatabaseClient() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, user, pass);
        }
        catch(Exception Ex) {
            Ex.printStackTrace();
        }
    }

    // Reteta Unitate Masura
    public static ArrayList<RetetaUnitMas> getAllRetetaUnitMas() throws SQLException {

        ArrayList<RetetaUnitMas> list = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM RetetaUnitMas");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            RetetaUnitMas ru = new RetetaUnitMas();
            ru.setIdRetetaUnitMas(rs.getInt(1));
            ru.setRetetaUnitMasUnitate(rs.getString(2));
            list.add(ru);
        }
        return list;
    }

    public static void insertRetetaUnitMas(RetetaUnitMas retetaUnitMas) throws SQLException {

        PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idRetetaUnitMas) FROM RetetaUnitMas");

        ResultSet rs = psCount.executeQuery();

        int Count = 0;

        while(rs.next()) {
            Count = rs.getInt(1);
        }

        PreparedStatement ps = connection.prepareStatement("INSERT INTO RetetaUnitMas(idRetetaUnitMas, RetetaUnitMasUnitate) VALUES (?, ?)");

        ps.setInt(1, Count);
        ps.setString(2, retetaUnitMas.getRetetaUnitMasUnitate());

        ps.executeUpdate();
    }

    //Reteta cantitate
    public static ArrayList<RetetaCant> getAllRetetaCant() throws SQLException {

        ArrayList<RetetaCant> listRetetaCant = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM RetetaCant");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            RetetaCant ru = new RetetaCant();
            ru.setIdRetetaCant(rs.getInt(1));
            ru.setRetetaCantCantitate(rs.getInt(2));
            listRetetaCant.add(ru);
        }
        return  listRetetaCant;
    }


    //Materie Prima
    public static ArrayList<MateriePrima> getAllMateriePrima() throws SQLException {

        ArrayList<MateriePrima> listMateriePrima = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM MateriePrima");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            MateriePrima ru = new MateriePrima();
            ru.setIdMateriePrima(rs.getInt(1));
            ru.setMateriePrimaNume(rs.getString(2));
            listMateriePrima.add(ru);
        }
        return  listMateriePrima;
    }

    public static void insertMateriePrima(MateriePrima materiePrima) throws SQLException {

        PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idMateriePrima) FROM MateriePrima");

        ResultSet rs = psCount.executeQuery();

        int Count = 0;

        while(rs.next()) {
            Count = rs.getInt(1);
        }

        PreparedStatement ps = connection.prepareStatement("INSERT INTO MateriePrima(idMateriePrima, MateriePrimaNume) VALUES (?, ?)");

        ps.setInt(1, Count);
        ps.setString(2, materiePrima.getMateriePrimaNume());

        ps.executeUpdate();
    }

    // Magazie Materie Prima
    public static ArrayList<MagazieMP> getAllMagazieMP() throws SQLException {

        ArrayList<MagazieMP> listMagazieMp = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM MagazieMP");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            MagazieMP ru = new MagazieMP();
            ru.setIdMagazieMP(rs.getInt(1));
            ru.setMagazieMPUnitMas(rs.getString(2));
            ru.setMagazieMPDataAchiz(rs.getDate(3));
            ru.setMagazieMPFurnizor(rs.getString(4));
            ru.setMagazieMPDocAchiz(rs.getInt(5));
            ru.setMagazieMPIdMateriePrima(rs.getInt(6));
            ru.setMagazieMPUtilizat(rs.getString(7));
            listMagazieMp.add(ru);
        }
        return listMagazieMp;
    }

    public static void insertMagazieMp(MagazieMP magazieMP) throws SQLException {

        //Validare fk

        PreparedStatement psValidare = connection.prepareStatement("SELECT * FROM MateriePrima where idMateriePrima = " + magazieMP.getMagazieMPIdMateriePrima() + "");

        ResultSet rs = psValidare.executeQuery();

        int fCount = 0;

        while(rs.next()) {
            fCount = fCount + 1;
        }

        if(fCount == 0) {
            System.out.println("Nu exista Materia Prima!");
        } else {

            PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idMagazieMP) FROM MagazieMP");

            ResultSet rs1 = psCount.executeQuery();

            int Count = 0;
            int quantity = magazieMP.getMagazieMPCant();

            while(rs1.next()) {
                Count = rs1.getInt(1);
            }

                PreparedStatement ps = connection.prepareStatement("INSERT INTO MagazieMP(idMagazieMP, magazieMPUnitMas, magazieMPDataAchiz, magazieMPFurnizor, magazieMPDocAchiz, magazieMPIdMateriePrima, magazieMPUtilizat) VALUES (?, ?, ?, ?, ?, ?, ?)");

                int newCount = Count + quantity;

            for (int a = Count; a < newCount; a++) {

                ps.setInt(1, a);
                ps.setString(2, magazieMP.getMagazieMPUnitMas());
                ps.setDate(3, magazieMP.getMagazieMPDataAchiz());
                ps.setString(4, magazieMP.getMagazieMPFurnizor());
                ps.setInt(5, magazieMP.getMagazieMPDocAchiz());
                ps.setInt(6, magazieMP.getMagazieMPIdMateriePrima());
                ps.setString(7, magazieMP.getMagazieMPUtilizat());

                ps.executeUpdate();
            }
        }
    }

    //tabela Reteta
    public static ArrayList<Reteta> getAllReteta() throws SQLException {

        ArrayList<Reteta> listReteta = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Reteta");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            Reteta ru = new Reteta();
            ru.setIdReteta(rs.getInt(1));
            ru.setRetetaNume(rs.getString(2));
            listReteta.add(ru);
        }
        return listReteta;
    }

    public static void insertReteta(Reteta reteta) throws SQLException {

        PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idReteta) FROM Reteta");

        ResultSet rs1 = psCount.executeQuery();

        int Count = 0;

        while(rs1.next()) {
            Count = rs1.getInt(1);
        }

        PreparedStatement ps = connection.prepareStatement("INSERT INTO Reteta(idReteta, retetaNume) VALUES (?, ?)");

        ps.setInt(1, Count);
        ps.setString(2, reteta.getRetetaNume());


        ps.executeUpdate();
    }
    //tabela Reteta ingredient
    public static ArrayList<RetetaIngredient> getAllRetetaIngredient() throws SQLException {

        ArrayList<RetetaIngredient> listRetetaIngredient = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM RetetaIngredient");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            RetetaIngredient ru = new RetetaIngredient();
            ru.setIdRetetaIngredient(rs.getInt(1));
            ru.setRetetaIngredientIdRetetaCant(rs.getInt(2));
            ru.setRetetaIngredientIdRetetaUnitMas(rs.getInt(3));
            ru.setRetetaIngredientIdMateriePrima(rs.getInt(4));
            ru.setRetetaIngredientIdReteta(rs.getInt(5));
            listRetetaIngredient.add(ru);
        }
        return listRetetaIngredient;
    }
    public static void insertRetetaIngredient(RetetaIngredient retetaIngredient) throws SQLException {

        PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idRetetaIngredient) FROM RetetaIngredient");

        ResultSet rs = psCount.executeQuery();

        int Count = 0;

        while(rs.next()) {
            Count = rs.getInt(1);
        }

        PreparedStatement ps = connection.prepareStatement("INSERT INTO RetetaIngredient(idReteta, retetaIngredientIdRetetaCant, retetaIngredientIdRetetaUnitMas, retetaIngredientIdMateriePrima, retetaIngredientIdReteta) VALUES (?, ?, ?, ?, ?)");

        ps.setInt(1, Count);
        ps.setInt(2, retetaIngredient.getRetetaIngredientIdRetetaCant());
        ps.setInt(3, retetaIngredient.getRetetaIngredientIdRetetaUnitMas());
        ps.setInt(4, retetaIngredient.getRetetaIngredientIdMateriePrima());
        ps.setInt(5, retetaIngredient.getRetetaIngredientIdReteta());

        ps.executeUpdate();
    }
    //tabela Produs
    public static ArrayList<Produs> getAllProdus() throws SQLException {

        ArrayList<Produs> listProdus = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Produs");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            Produs ru6 = new Produs();
            ru6.setIdProdus(rs.getInt(1));
            ru6.setProdusNume(rs.getString(2));
            ru6.setProdusValabilitateLuni(rs.getInt(3));
            ru6.setProdusIdReteta(rs.getInt(4));
            listProdus.add(ru6);
        }
        return listProdus;
    }

    public static void insertProdus(Produs produs) throws SQLException {

        PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idProdus) FROM Produs");

        ResultSet rs = psCount.executeQuery();

        int Count = 0;

        while(rs.next()) {
            Count = rs.getInt(1);
        }

        PreparedStatement ps = connection.prepareStatement("INSERT INTO Produs(idProdus, produsNume, produsValabilitateLuni, produsIdReteta) VALUES (?, ?, ?, ?)");

        ps.setInt(1, Count);
        ps.setString(2, produs.getProdusNume());
        ps.setInt(3, produs.getProdusValabilitateLuni());
        ps.setInt(4, produs.getProdusIdReteta());

        ps.executeUpdate();
    }

    //tabela Lot
    public static ArrayList<Lot> getAllLot() throws SQLException {

        ArrayList<Lot> listLot = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Lot");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            Lot ru = new Lot();
            ru.setIdLot(rs.getInt(1));
            ru.setLotCantitate(rs.getInt(2));
            ru.setLotIdProdus(rs.getInt(3));
            ru.setLotIdReteta(rs.getInt(4));
            listLot.add(ru);
        }
        return listLot;
    }

    public static void insertLot(Lot lot) throws SQLException {

        PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idLot) FROM Lot");

        ResultSet rs = psCount.executeQuery();

        int Count = 0;

        while(rs.next()) {
            Count = rs.getInt(1);
        }

        PreparedStatement ps = connection.prepareStatement("INSERT INTO Lot(idLot, lotCantitate, lotIdProdus, lotIdReteta) VALUES (?, ?, ?, ?)");

        ps.setInt(1, Count);
        ps.setInt(2, lot.getLotCantitate());
        ps.setInt(3, lot.getLotIdProdus());
        ps.setInt(4, lot.getLotIdReteta());

        ps.executeUpdate();
    }

    //tabela MagaziePF
    public static ArrayList<MagaziePF> getAllMagaziePF() throws SQLException {

        ArrayList<MagaziePF> listMagaziePF = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM MagaziePF");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            MagaziePF ru8 = new MagaziePF();
            ru8.setIdMagaziePF(rs.getInt(1));
            ru8.setMagaziePFDataProd(rs.getDate(2));
            ru8.setMagaziePFIdLot(rs.getInt(3));
            ru8.setMagaziePFIdProdus(rs.getInt(4));
            ru8.setMagaziePFIdReteta(rs.getInt(5));
            listMagaziePF.add(ru8);
        }
        return listMagaziePF;
    }

    public static void insertMagaziePF(MagaziePF magaziePF) throws SQLException {

        //Validare fk

        PreparedStatement psValidare = connection.prepareStatement("SELECT * FROM Lot where idLot = " + magaziePF.getMagaziePFIdLot() + "");

        ResultSet rs = psValidare.executeQuery();

        int fCount = 0;

        while(rs.next()) {
            fCount = fCount + 1;
        }

        if(fCount == 0) {
            System.out.println("Acest lot nu exista!");
        } else {

            PreparedStatement psCount = connection.prepareStatement("SELECT COUNT(idMagaziePF) FROM MagaziePF");

            ResultSet rs1 = psCount.executeQuery();

            int Count = 0;

            while(rs1.next()) {
                Count = rs1.getInt(1);
            }

            PreparedStatement ps = connection.prepareStatement("INSERT INTO MagaziePF(idMagaziePF, magaziePFDataProd, magaziePFIdLot, magaziePFIdProdus, magaziePFIdReteta) VALUES (?, ?, ?, ?, ?)");

            ps.setInt(1, Count);
            ps.setDate(2, magaziePF.getMagaziePFDataProd());
            ps.setInt(3, magaziePF.getMagaziePFIdLot());
            ps.setInt(4, magaziePF.getMagaziePFIdProdus());
            ps.setInt(5, magaziePF.getMagaziePFIdReteta());

            ps.executeUpdate();
        }
    }

    //Flux Lot -> Magazia produs finit (Selectare si schimbare Utilizat)
    public static ArrayList<MagazieMP> getUpdateUtilizat(int cantitate, int id) throws SQLException {

        ArrayList<MagazieMP> listUpdateUtilizat = new ArrayList<>();

        PreparedStatement ps = connection.prepareStatement("UPDATE MagazieMP SET magazieMPUtilizat = 'Da' WHERE magazieMPIdMateriePrima = " + id + " AND magazieMPUtilizat = 'Nu' ORDER BY magazieMPDataAchiz LIMIT " + cantitate);

        ps.executeUpdate();

        return listUpdateUtilizat;
    }
}


