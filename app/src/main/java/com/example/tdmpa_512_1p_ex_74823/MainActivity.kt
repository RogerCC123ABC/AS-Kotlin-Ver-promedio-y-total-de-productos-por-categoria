package com.example.tdmpa_512_1p_ex_74823

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var btnCalulcarTotalPromedio = findViewById<Button>(R.id.btnTotalPromedio);
        var btnAgregar = findViewById<Button>(R.id.btnAgregar);
        var btnComida = findViewById<Button>(R.id.btnComida);
        var btnAnime = findViewById<Button>(R.id.btnAnime);
        var btnAuto = findViewById<Button>(R.id.btnAuto);
        var btnVideojuego = findViewById<Button>(R.id.btnVideojuego);
        var txtMonto = findViewById<EditText>(R.id.txtMonto);

        btnCalulcarTotalPromedio.setOnClickListener{
            calcularTotalYPromedio();
        }



        btnAgregar.setOnClickListener{
            guardarCoceptos();
            agregarMonto();
            btnCalulcarTotalPromedio.isEnabled = true;

        }
        btnComida.setOnClickListener{
            var txtResultado = findViewById<TextView>(R.id.txtResultado);
            var resultadoTotal = 0.0;
            var resultadoPromedio = 0.0;
            MontoComida.add(txtMonto.text.toString().toDouble());

            for (i in 0 .. MontoComida.size - 1){
                resultadoTotal+=MontoComida[i];
            }

            for (i in 0 .. MontoComida.size - 1){
                resultadoTotal+=MontoComida[i];
                resultadoPromedio = resultadoTotal / MontoComida.size;
            }

            txtResultado.text = "El total de la categoría es ${resultadoTotal.toString()} y su promedio es ${resultadoPromedio.toString()}";
        }

        btnAnime.setOnClickListener{
            var txtResultado = findViewById<TextView>(R.id.txtResultado);
            var resultadoTotal = 0.0;
            var resultadoPromedio = 0.0;
            MontoAnime.add(txtMonto.text.toString().toDouble())

            for (i in 0 .. MontoAnime.size - 1){
                resultadoTotal+=MontoAnime[i];
            }

            for (i in 0 .. MontoAnime.size - 1){
                resultadoTotal+=MontoAnime[i];
                resultadoPromedio = resultadoTotal / MontoAnime.size;
            }

            txtResultado.text = "El total de la categoría es ${resultadoTotal.toString()} y su promedio es ${resultadoPromedio.toString()}";
        }

        btnAuto.setOnClickListener{
            var txtResultado = findViewById<TextView>(R.id.txtResultado);
            var resultadoTotal = 0.0;
            var resultadoPromedio = 0.0;
            MontoAuto.add(txtMonto.text.toString().toDouble())

            for (i in 0 .. MontoAuto.size - 1){
                resultadoTotal+=MontoAuto[i];
            }

            for (i in 0 .. MontoAuto.size - 1){
                resultadoTotal+=MontoAuto[i];
                resultadoPromedio = resultadoTotal / MontoAuto.size;
            }

            txtResultado.text = "El total de la categoría es ${resultadoTotal.toString()} y su promedio es ${resultadoPromedio.toString()}"
        }

        btnVideojuego.setOnClickListener{
            var txtResultado = findViewById<TextView>(R.id.txtResultado);
            var resultadoTotal = 0.0;
            var resultadoPromedio = 0.0;

            MontoVideojuego.add(txtMonto.text.toString().toDouble())

            for (i in 0 .. MontoVideojuego.size - 1){
                resultadoTotal+=MontoVideojuego[i];
            }

            for (i in 0 .. MontoVideojuego.size - 1){
                resultadoTotal+=MontoVideojuego[i];
                resultadoPromedio = resultadoTotal / MontoAuto.size;
            }

            txtResultado.text = "El total de la categoría es ${resultadoTotal.toString()} y su promedio es ${resultadoPromedio.toString()}"
        }


    }

    var MontoVideojuego: MutableList<Double> = mutableListOf();
    var MontoComida: MutableList<Double> = mutableListOf();
    var MontoAnime: MutableList<Double> = mutableListOf();
    var MontoAuto: MutableList<Double> = mutableListOf();
    var MontoTotalPromedio: MutableList<Double> = mutableListOf();

    var conceptoVideojuego: MutableList<String> = mutableListOf();
    var conceptoComida: MutableList<String> = mutableListOf();
    var conceptoAuto: MutableList<String> = mutableListOf();
    var conceptoAnime: MutableList<String> = mutableListOf();



    fun guardarCoceptos(){
        var btnComida = findViewById<Button>(R.id.btnComida);
        var btnAnime = findViewById<Button>(R.id.btnAnime);
        var btnAuto = findViewById<Button>(R.id.btnAuto);
        var btnVideojuego = findViewById<Button>(R.id.btnVideojuego);
        var txtConcepto = findViewById<EditText>(R.id.txtConcepto);
        var txtResultado = findViewById<TextView>(R.id.txtResultado);

        when{
            (btnAuto.isClickable) -> conceptoAuto.add(txtConcepto.text.toString());
            (btnAnime.isClickable) -> conceptoAnime.add(txtConcepto.text.toString());
            (btnComida.isClickable) -> conceptoComida.add(txtConcepto.text.toString());
            (btnVideojuego.isClickable) -> conceptoVideojuego.add(txtConcepto.text.toString());
            else -> txtResultado.text = "Seleccione una categoría"
        }
    }

    fun agregarMonto(){
        var txtMonto = findViewById<EditText>(R.id.txtMonto);
        MontoTotalPromedio.add(txtMonto.text.toString().toDouble())

    }

    fun calcularTotalYPromedio(){
        var txtResultado = findViewById<TextView>(R.id.txtResultado);
        var resultadoTotal = 0.0;
        var resultadoPromedio = 0.0;
        for (i in 0 .. MontoTotalPromedio.size - 1){
            resultadoTotal+=MontoTotalPromedio[i];
        }

        for (i in 0 .. MontoTotalPromedio.size - 1){
            resultadoTotal+=MontoTotalPromedio[i];
            resultadoPromedio = resultadoTotal / MontoTotalPromedio.size;
        }

        txtResultado.text = "El total es ${resultadoTotal.toString()} y el promedio es ${resultadoPromedio.toString()}";

    }





}