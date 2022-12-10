package com.example.nowfootball;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.nowfootball.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

        ActivityMainBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP){
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            }


            setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

            setSupportActionBar(binding.toolbar);

            AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                    // Top-level destinations:
                    R.id.home, R.id.descubrir, R.id.partidos, R.id.siguiendo, R.id.noticiasMarcadas, R.id.editarPerfil
            )
                    .setOpenableLayout(binding.drawerLayout)
                    .build();

            /*ImageButton button = (ImageButton)findViewById(R.id.boton_editar_perfil);
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent,);
                }
            });*/

            NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
            NavigationUI.setupWithNavController(binding.bottomNavView, navController);
            NavigationUI.setupWithNavController(binding.navView, navController);
            NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration);

            navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
                if (navDestination.getId() == R.id.inicio_de_sesion ||
                        navDestination.getId() == R.id.inicio_on_delay2 ||
                        navDestination.getId() == R.id.crearCuenta ||
                        navDestination.getId() == R.id.opcion_de_inicio ||
                        navDestination.getId() == R.id.verificarCuenta ||
                        navDestination.getId() == R.id.recuperarContrasena1||
                        navDestination.getId() == R.id.recuperarContrasena2 ||
                        navDestination.getId() == R.id.recuperarContrasena3) {
                    // getSupportActionBar().hide();
                    binding.toolbar.setVisibility(View.GONE);
                } else {
                    binding.toolbar.setVisibility(View.VISIBLE);
                }
            });
            navController.addOnDestinationChangedListener((navController1, navDestination, bundle) -> {
                if (navDestination.getId() == R.id.inicio_de_sesion ||
                        navDestination.getId() == R.id.inicio_on_delay2 ||
                        navDestination.getId() == R.id.crearCuenta ||
                        navDestination.getId() == R.id.opcion_de_inicio ||
                        navDestination.getId() == R.id.editarPerfil ||
                        navDestination.getId() == R.id.recuperarContrasena1||
                        navDestination.getId() == R.id.recuperarContrasena2 ||
                        navDestination.getId() == R.id.seleccion1 ||
                        navDestination.getId() == R.id.seleccion2 ||
                        navDestination.getId() == R.id.jugador1 ||
                        navDestination.getId() == R.id.jugador2 ||
                        navDestination.getId() == R.id.jugador3 ||
                        navDestination.getId() == R.id.jugador4 ||
                        navDestination.getId() == R.id.noticiasMarcadas ||
                        navDestination.getId() == R.id.noticia1 ||
                        navDestination.getId() == R.id.noticia2 ||
                        navDestination.getId() == R.id.noticia3 ||
                        navDestination.getId() == R.id.noticia4 ||
                        navDestination.getId() == R.id.noticia5 ||
                        navDestination.getId() == R.id.siguiendo ||
                        navDestination.getId() == R.id.listaA_Z ||
                        navDestination.getId() == R.id.lista_ranking_selecciones ||
                        navDestination.getId() == R.id.lista_jugadores_top ||
                        navDestination.getId() == R.id.listaJovenesPromesas ||
                        navDestination.getId() == R.id.listaConcacaf ||
                        navDestination.getId() == R.id.listaConmebol ||
                        navDestination.getId() == R.id.listaUefa ||
                        navDestination.getId() == R.id.listaCaf ||
                        navDestination.getId() == R.id.listaAfc ||
                        navDestination.getId() == R.id.partido1Button ||
                        navDestination.getId() == R.id.partido2Button ||
                        navDestination.getId() == R.id.partido3Button ||
                        navDestination.getId() == R.id.partido4 ||
                        navDestination.getId() == R.id.partido5 ||
                        navDestination.getId() == R.id.todosLosPartidosSel1 ||
                        navDestination.getId() == R.id.todosLosPartidosSel2 ||
                        navDestination.getId() == R.id.verificarCuenta ||
                        navDestination.getId() == R.id.clasificacion ||
                        navDestination.getId() == R.id.recuperarContrasena3) {
//                     getSupportActionBar().hide();
                    binding.bottomNavView.setVisibility(View.GONE);
                } else {
                    binding.bottomNavView.setVisibility(View.VISIBLE);
                }
            });
        }
        public void MensajeNoticiaMarcada(View view){
            Toast.makeText(this, "Noticia Marcada", Toast.LENGTH_SHORT).show();
        }
        public void MensajePerfilActualizado(View view){
        Toast.makeText(this, "Perfil Actualizado", Toast.LENGTH_SHORT).show();
        }

    }