using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Travel_Information
{
    public partial class Main : Form
    {
        public Main()
        {
            InitializeComponent();
        }
        public Main(string username) {
            InitializeComponent();
            label_user.Text = username;
        }

        private void tabPage1_Click(object sender, EventArgs e)
        {

        }

        private void Main_Load(object sender, EventArgs e)
        {
            try
            {
                //webBrowser1.Url = new Uri("http://www.2345.com");  
                //这个文件于可执行文件放在同一目录  
                webBrowser1.Url = new Uri(Path.Combine(Application.StartupPath, "map.html"));
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message, "异常", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }  
        }

        private void webBrowser1_DocumentCompleted(object sender, WebBrowserDocumentCompletedEventArgs e)
        {
            //这里传入x、y的值，调用JavaScript脚本  
            webBrowser1.Document.InvokeScript("setLocation", new object[] { 121.504, 39.212 });  
        }
    }
}
