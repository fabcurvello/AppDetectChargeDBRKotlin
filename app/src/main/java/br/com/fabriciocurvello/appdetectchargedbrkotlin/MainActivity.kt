package br.com.fabriciocurvello.appdetectchargedbrkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var tvPowerStatus: TextView

    // BroadcastReceiver para capturar os eventos de conexão e desconexão do cabo de energia
    private val powerReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val action = intent.action
            if (Intent.ACTION_POWER_CONNECTED == action) {
                tvPowerStatus.setText("Cabo de energia conectado")
            } else if (Intent.ACTION_POWER_DISCONNECTED == action) {
                tvPowerStatus.setText("Cabo de energia desconectado")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Conectar o TextView do layout
        tvPowerStatus = findViewById(R.id.tv_power_status)

        // Registrar o BroadcastReceiver dinamicamente
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_POWER_CONNECTED)
        filter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        registerReceiver(powerReceiver, filter)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Cancelar o registro do BroadcastReceiver ao destruir a atividade
        unregisterReceiver(powerReceiver)
    }
}


