using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MySql.Data.MySqlClient;
using System.Data;

namespace Travel_Information
{
    public class MySQLConn
    {
        private string MySqlCon = "Database=traveltest;Data Source=127.0.1;User Id=root;"+
            "Password=123456;pooling=false;CharSet=utf8;port=3306";

        public DataTable ExecuteQuery(string sqlStr) {
            MySqlCommand cmd;
            MySqlConnection con;
            MySqlDataAdapter msda;
            con = new MySqlConnection(MySqlCon);
            con.Open();
            cmd = new MySqlCommand(sqlStr, con);
            cmd.CommandType = CommandType.Text;
            DataTable dt = new DataTable();
            msda = new MySqlDataAdapter(cmd);
            msda.Fill(dt);
            con.Close();
            return dt;
        }
        public int ExecuteUpdate(String sqlStr) {
            MySqlCommand cmd;
            MySqlConnection con;
            con = new MySqlConnection(MySqlCon);
            con.Open();
            cmd = new MySqlCommand(sqlStr, con);
            cmd.CommandType = CommandType.Text;
            int iud = 0;
            iud = cmd.ExecuteNonQuery();
            con.Close();
            return iud;
        }
    }
}
