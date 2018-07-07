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
            String username = txt_username.Text;
            String password = txt_password.Text;
            if (username == "" || password == "")
            {
                MessageBox.Show("用户名或密码不能为空");
            }
            else {
                string connectionString = "server=localhost;port=3306;database=traveltest;user=root;password=123456;";

                MySqlConnection connection = new MySqlConnection(connectionString);
                connection.Open();


                string sql = "select * from user_info where user_id='" + username + " ' and user_pwd='" + password + "'";
                //MySqlCommand login_command = new MySqlCommand(sql, connection);
                MySqlCommand login_command = new MySqlCommand(sql, connection);

                login_command.CommandType = CommandType.Text;

                MySqlDataReader login_reader;

                login_reader = login_command.ExecuteReader();
                if (login_reader.Read())
                {
                    MessageBox.Show("登陆成功", "提示");
                }
                else {
                    MessageBox.Show("用户名或密码错误","提示");
                    return;
                }
         
            }
            
            
            


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
