using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(ProyectoIPC2.Startup))]
namespace ProyectoIPC2
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
