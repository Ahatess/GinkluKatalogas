package ginklai.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DBActions {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/ginklukatalogas";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "";
    private Connection _connect = null;

    public DBActions() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            _connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String spausdinkRezultatus(ResultSet values) {
        String result = "";
        ResultSetMetaData lentelesInfo = null;
        try {
            lentelesInfo = values.getMetaData();
            while (values.next()) {
                for (int i = 1; i <= lentelesInfo.getColumnCount(); i++) {
                    result += values.getString(i) + " ";
                }
                result += "<br>";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<HashMap<String, String>> setToList(ResultSet set) {
        ArrayList<HashMap<String, String>> result = new ArrayList<HashMap<String, String>>();

        try {
            ResultSetMetaData metaData = set.getMetaData();
            while (set.next()) {
                HashMap<String, String> eilute = new HashMap<String, String>();
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    eilute.put(metaData.getColumnName(i), set.getString(i));
                }
                result.add(eilute);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<HashMap<String, String>> rodykMedžioklinius() {
        Statement statement = null;
        try {
            statement = _connect.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_paskirtis` = 'Medžioklei'");
            return setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<HashMap<String, String>> rodykSavigynai() {
        Statement statement = null;
        try {
            statement = _connect.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_paskirtis` = 'Savigynai'");
            return setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<HashMap<String, String>> rodykTaikiniams(){
        Statement statement=null;
        try {
            statement=_connect.createStatement();
            ResultSet set=statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_paskirtis` = 'Taikiniams'");
            return setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<HashMap<String, String>>rodykGraiztvinius(){
        Statement statement=null;
        try {
            statement=_connect.createStatement();
            ResultSet set=statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_tipas` = 'Graižtvinis'");
            return  setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<HashMap<String, String>>rodykPistoletus(){
        Statement statement=null;
        try {
            statement=_connect.createStatement();
            ResultSet set=statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_tipas` = 'Pistoletas'");
            return setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<HashMap<String, String>>rodykLygiavamzdzius(){
        Statement statement=null;
        try {
            statement=_connect.createStatement();
            ResultSet set=statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_tipas` = 'Lygiavamzdis'");
            return setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<HashMap<String, String>>rodykPneumatinius(){
        Statement statement=null;
        try {
            statement=_connect.createStatement();
            ResultSet set=statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_tipas` = 'Pneumatinis'");
            return setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<HashMap<String, String>>rodykVisus(){
        Statement statement=null;
        try {
            statement=_connect.createStatement();
            ResultSet set=statement.executeQuery("SELECT * FROM `ginklai`");
            return setToList(set);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public ArrayList<HashMap<String, String>>parinkimasMedziokleiGraiztvinis(){
        Statement statement=null;
        try {
            statement=_connect.createStatement();
            ResultSet set=statement.executeQuery("SELECT * FROM `ginklai` WHERE `ginklo_paskirtis` = 'Medžioklei' AND `ginklo_tipas` = 'Graižtvinis'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
