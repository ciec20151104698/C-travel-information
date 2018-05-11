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
    public partial class Frm_Register : Form
    {
        public Frm_Register()
        {
            InitializeComponent();
        }

        private void txt_rgusername_TextChanged(object sender, EventArgs e)
        {

        }

        private void btn_ok_Click(object sender, EventArgs e)
        {
            string user_connectionString = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\\Users\\a447119040\\Desktop\\test.accdb";
            OleDbConnection user_connection = new OleDbConnection(user_connectionString);
            user_connection.Open();

            string rg_username = txt_rgusername.Text;
            string rg_password = txt_rgpassword.Text;
            string rg_repassword = txt_rgrepassword.Text;
            string rg_retelnumber = txt_rgtelnumber.Text;

            
            if (rg_password == rg_repassword)
            {
                string user_add_command = "INSERT INTO tb_user VALUES('"+ rg_username +" ', '"+ rg_password +"')";
                OleDbCommand user_add = new OleDbCommand(user_add_command,user_connection);
                user_add.ExecuteNonQuery();
            }
            else {
                MessageBox.Show("两次密码输入不一致,请重新输入");
            }
        }

        private void Frm_Register_Load(object sender, EventArgs e)
        {

        }
    }
}
