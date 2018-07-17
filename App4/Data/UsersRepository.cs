using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using App4.Models;
namespace App4.Data
{
    public class UsersRepository
    {
        private List<Users> _users;
        public UsersRepository()
        {
            _users = new List<Users>()
            {
                new Users()
                {
                    Id = 1,
                    Nombre = "Javier",
                    Correo = "jhuaynatesc@gmail.com",
                    Password = "abc123++",
                    Tipo = "Admin"
                },
                new Users()
                {
                    Id = 2,
                    Nombre = "Javier",
                    Correo = "admin@gmail.com",
                    Password = "abc123++",
                    Tipo = "Admin"
                },
                new Users()
                {
                    Id = 3,
                    Nombre = "Javier",
                    Correo = "alexitwo@gmail.com",
                    Password = "abc123++",
                    Tipo = "Admin"
                }
            };
        }
        public List<Users> GetUsers()
        {
            return _users;
        }
        public Users GetUsersById(int Id)
        {
            return _users.FirstOrDefault(x => x.Id == Id);
        }
        public Users GetUsersAutentication(string Correo, string Password)
        {
            return _users.FirstOrDefault(x => x.Correo == Correo && x.Password == Password);
        }
    }
}