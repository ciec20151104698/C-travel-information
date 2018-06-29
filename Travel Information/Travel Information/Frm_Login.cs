using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

using System.Data.OleDb;

namespace Travel_Information
{
    public partial class Frm_Login : Form
    {
        public Frm_Login()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void btn_login_Click(object sender, EventArgs e)
        {
            //string connectionSrting = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\\Users\\a447119040\\Desktop\\test.accdb";
            //OleDbConnection connection = new OleDbConnection(connectionSrting);
            //connection.Open();
            //OleDbCommand command_login = new OleDbCommand("select * from tb_user", connection);
            //OleDbDataReader login_reader = command_login.ExecuteReader();

            string connectionString = "Data Source=localhost;port=3306;Initial Catalog=traveltest;User Id=root;password=123456;";
            MySqlConnection connection = new MySqlConnection(connectionString);
            string sql = "select * from user_info";
            connection.Open();
            MySqlCommand login_command = new MySqlCommand(sql, connection);
            MySqlDataReader login_reader = login_command.ExecuteReader();

            MessageBox.Show(login_reader["user_id"].ToString());


            /*while (login_reader.Read())
            {
                string username = login_reader["user_id"].ToString();
                string password = login_reader["user_pwd"].ToString();
                if (txt_username.Text == username && txt_password.Text == password)
                {
                    Main main = new Main();
                    main.Show();
                }
                else if (txt_username.Text == username && txt_password.Text != password)
                {
                    MessageBox.Show("用户名或密码错误！");
                }
                else if (txt_username.Text != username && txt_password.Text == password) {
                    MessageBox.Show("用户名或密码错误！");
                }
                else if (txt_username.Text != username && txt_password.Text != password) {
                    DialogResult dr = MessageBox.Show("没有此用户，请注册！","提示信息",MessageBoxButtons.OKCancel);
                    if (dr == DialogResult.OK)
                    {
                        Frm_Register rg = new Frm_Register();
                        rg.Show();
                    }                    
                }
            }*/
            
        }

        private void btn_register_Click(object sender, EventArgs e)
        {
            Frm_Register rt = new Frm_Register();
            rt.Show();
        }
    }
}
