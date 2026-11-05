package com.google.developer;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.graphics.Color;
import android.widget.*;
import android.view.Gravity;
import android.content.Intent;
import android.net.Uri;
import java.util.*;

public class MainActivity extends Activity {
    String namaUser = "Rafi";
    int totalHarga = 0;
    String keranjang = "";
    ArrayList<String> chatList = new ArrayList<>();
    LinearLayout chatLayout;

    @Override protected void onCreate(Bundle s){ super.onCreate(s); showSplash(); }

    void showSplash(){
        LinearLayout l = new LinearLayout(this); l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#16A34A")); l.setGravity(Gravity.CENTER);
        TextView t = new TextView(this); t.setText("🍔 RAFI FOOD\n⭐ PRO v3.0"); t.setTextSize(32); t.setTextColor(Color.WHITE); t.setGravity(Gravity.CENTER);
        TextView s = new TextView(this); s.setText("\n+ SAKTI BOT 🤖\nMakanan Enak • Cepat • Hemat\nSurabaya"); s.setTextColor(Color.WHITE); s.setGravity(Gravity.CENTER); s.setTextSize(16);
        l.addView(t); l.addView(s); setContentView(l);
        new Handler().postDelayed(() -> showLogin(), 2000);
    }

    void showLogin(){
        LinearLayout l = new LinearLayout(this); l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#F0FDF4")); l.setPadding(50,100,50,50); l.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView title = new TextView(this); title.setText("🍔 RAFI FOOD PRO"); title.setTextSize(30); title.setTextColor(Color.parseColor("#16A34A")); title.setGravity(Gravity.CENTER);
        TextView sub = new TextView(this); sub.setText("Login untuk pesan makanan\nUser: Rafi\nPass: 12345\n"); sub.setGravity(Gravity.CENTER); sub.setTextSize(16);
        EditText user = new EditText(this); user.setHint("Username / No HP"); user.setBackgroundColor(Color.WHITE);
        EditText pass = new EditText(this); pass.setHint("Password"); pass.setInputType(129); pass.setBackgroundColor(Color.WHITE);
        Button btn = new Button(this); btn.setText("MASUK • LOGIN"); btn.setBackgroundColor(Color.parseColor("#16A34A")); btn.setTextColor(Color.WHITE);
        Button guest = new Button(this); guest.setText("MASUK SEBAGAI TAMU"); guest.setBackgroundColor(Color.parseColor("#F97316")); guest.setTextColor(Color.WHITE);
        l.addView(title); l.addView(sub); l.addView(user); l.addView(pass); l.addView(btn); l.addView(guest); setContentView(l);
        btn.setOnClickListener(v -> {
            if(user.getText().toString().trim().equals("Rafi") && pass.getText().toString().trim().equals("12345")){ namaUser="Rafi"; Toast.makeText(this,"Selamat Datang, Rafi! 🤖 SAKTI BOT aktif",Toast.LENGTH_SHORT).show(); show
> 
