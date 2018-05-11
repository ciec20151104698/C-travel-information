using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

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
            string connectionSrting = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\\Users\\a447119040\\Desktop\\test.accdb";
            OleDbConnection connection = new OleDbConnection(connectionSrting);
            connection.Open();
            OleDbCommand command_login = new OleDbCommand("select * from tb_user", connection);
            OleDbDataReader login_reader = command_login.ExecuteReader();
            while (login_reader.Read())
            {
                string username = login_reader["username"].ToString();
                string password = login_reader["password"].ToString();
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
            }
            
        }

        private void btn_register_Click(object sender, EventArgs e)
        {
            Frm_Register rt = new Frm_Register();
            rt.Show();
        }
    }
}
