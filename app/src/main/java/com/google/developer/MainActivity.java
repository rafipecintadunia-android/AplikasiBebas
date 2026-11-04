package com.google.developer;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.graphics.Color;
import android.widget.*;
import android.view.Gravity;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity {
    String namaUser = "Rafi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showSplash();
    }

    void showSplash() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#16A34A"));
        l.setGravity(Gravity.CENTER);
        TextView t = new TextView(this);
        t.setText("🍔 RAFI FOOD"); t.setTextSize(36); t.setTextColor(Color.WHITE); t.setGravity(Gravity.CENTER);
        TextView s = new TextView(this);
        s.setText("\nMakanan Enak • Cepat • Hemat\nSurabaya\n\nLoading..."); s.setTextColor(Color.WHITE); s.setGravity(Gravity.CENTER); s.setTextSize(16);
        l.addView(t); l.addView(s);
        setContentView(l);
        new Handler().postDelayed(() -> showLogin(), 2000);
    }

    void showLogin() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL);
        l.setBackgroundColor(Color.parseColor("#F0FDF4"));
        l.setPadding(50,100,50,50); l.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView title = new TextView(this);
        title.setText("🍔 RAFI FOOD"); title.setTextSize(30);
        title.setTextColor(Color.parseColor("#16A34A")); title.setGravity(Gravity.CENTER);
        TextView sub = new TextView(this);
        sub.setText("Login untuk pesan makanan\n\nUser: Rafi\nPass: 12345\n"); sub.setGravity(Gravity.CENTER); sub.setTextSize(16);
        EditText user = new EditText(this); user.setHint("Username / No HP"); user.setBackgroundColor(Color.WHITE);
        EditText pass = new EditText(this); pass.setHint("Password"); pass.setInputType(129); pass.setBackgroundColor(Color.WHITE);
        Button btn = new Button(this); btn.setText("MASUK • LOGIN");
        btn.setBackgroundColor(Color.parseColor("#16A34A")); btn.setTextColor(Color.WHITE);
        Button btnGuest = new Button(this); btnGuest.setText("MASUK SEBAGAI TAMU");
        btnGuest.setBackgroundColor(Color.parseColor("#F97316")); btnGuest.setTextColor(Color.WHITE);
        l.addView(title); l.addView(sub); l.addView(user); l.addView(pass); l.addView(btn); l.addView(btnGuest);
        setContentView(l);
        btn.setOnClickListener(v -> {
            if (user.getText().toString().trim().equals("Rafi") && pass.getText().toString().trim().equals("12345")) {
                namaUser = "Rafi"; Toast.makeText(this, "Selamat Datang di RAFI FOOD, Rafi!", Toast.LENGTH_SHORT).show(); showHome();
            } else Toast.makeText(this, "Login Gagal! Coba Rafi / 12345", Toast.LENGTH_SHORT).show();
        });
        btnGuest.setOnClickListener(v -> { namaUser = "Tamu"; showHome(); });
    }

    void showHome() {
        ScrollView scroll = new ScrollView(this);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#F0FDF4"));
        layout.setPadding(30, 40, 30, 40);

        TextView loc = new TextView(this); loc.setText("📍 Surabaya, Jawa Timur ▼"); loc.setTextSize(14); loc.setTextColor(Color.parseColor("#16A34A"));
        TextView hi = new TextView(this); hi.setText("\nHalo, " + namaUser + " 👋"); hi.setTextSize(24); hi.setTextColor(Color.BLACK);
        TextView cari = new TextView(this); cari.setText("Mau makan apa hari ini?"); cari.setTextSize(16);
        EditText search = new EditText(this); search.setHint("🔍 Cari Nasi Goreng, Ayam Geprek..."); search.setBackgroundColor(Color.WHITE);

        TextView promo = new TextView(this);
        promo.setText("\n🔥 PROMO SPESIAL HARI INI!\nDiskon s.d 40% • Gratis Ongkir min Rp 25.000\nKode: RAFIHEMAT");
        promo.setTextSize(16); promo.setBackgroundColor(Color.parseColor("#F97316")); promo.setTextColor(Color.WHITE); promo.setPadding(30,30,30,30); promo.setGravity(Gravity.CENTER);

        TextView katTitle = new TextView(this); katTitle.setText("\nKategori"); katTitle.setTextSize(20);
        LinearLayout katRow = new LinearLayout(this); katRow.setOrientation(LinearLayout.HORIZONTAL);
        Button k1 = new Button(this); k1.setText("🍔\nMakanan"); k1.setBackgroundColor(Color.parseColor("#DCFCE7"));
        Button k2 = new Button(this); k2.setText("🥤\nMinuman"); k2.setBackgroundColor(Color.parseColor("#FFEDD5"));
        Button k3 = new Button(this); k3.setText("🍩\nJajanan"); k3.setBackgroundColor(Color.parseColor("#FEF9C3"));
        Button k4 = new Button(this); k4.setText("📦\nPaket Hemat"); k4.setBackgroundColor(Color.parseColor("#DBEAFE"));
        katRow.addView(k1); katRow.addView(k2); katRow.addView(k3); katRow.addView(k4);

        TextView rec = new TextView(this); rec.setText("\nRekomendasi Untukmu ⭐"); rec.setTextSize(20);

        layout.addView(loc); layout.addView(hi); layout.addView(cari); layout.addView(search); layout.addView(promo); layout.addView(katTitle); layout.addView(katRow); layout.addView(rec);

        // Daftar makanan
        String[][] foods = {
            {"Nasi Goreng Spesial", "⭐ 4.9 • 15-25 mnt • 1.2 km", "Rp 25.000", "Nasi Goreng Spesial"},
            {"Ayam Geprek Sambal Pedas", "⭐ 4.9 • 20-30 mnt • 1.5 km", "Rp 22.000", "Ayam Geprek"},
            {"Es Teh Manis Segar", "⭐ 4.9 • 10-15 mnt • 800 m", "Rp 8.000", "Es Teh Manis"},
            {"Sate Ayam 10 Tusuk", "⭐ 4.8 • 20-25 mnt • 2.0 km", "Rp 18.000", "Sate Ayam"},
            {"Paket Hemat Rafi (Nasi+Ayam+Teh)", "⭐ 5.0 • 15-20 mnt • 1.0 km", "Rp 30.000", "Paket Hemat Rafi"}
        };
        for (String[] f : foods) {
            TextView item = new TextView(this);
            item.setText("\n" + f[0] + "\n" + f[1] + "\n" + f[2] + "  •  [ TAP UNTUK PESAN ]");
            item.setTextSize(16); item.setBackgroundColor(Color.WHITE); item.setPadding(30,20,30,20);
            item.setOnClickListener(v -> pesanWA(f[3], f[2]));
            layout.addView(item);
        }

        Button btnPromo = new Button(this); btnPromo.setText("🎁 LIHAT SEMUA PROMO");
        btnPromo.setBackgroundColor(Color.parseColor("#16A34A")); btnPromo.setTextColor(Color.WHITE);
        Button btnSend = new Button(this); btnSend.setText("🛵 RAFI SEND - KIRIM BARANG");
        btnSend.setBackgroundColor(Color.parseColor("#0EA5E9")); btnSend.setTextColor(Color.WHITE);
        Button btnAkun = new Button(this); btnAkun.setText("👤 AKUN SAYA");
        btnAkun.setBackgroundColor(Color.parseColor("#F59E0B")); btnAkun.setTextColor(Color.WHITE);
        Button btnLogout = new Button(this); btnLogout.setText("🚪 LOGOUT");
        btnLogout.setBackgroundColor(Color.parseColor("#111827")); btnLogout.setTextColor(Color.WHITE);
        TextView foot = new TextView(this); foot.setText("\nRAFI FOOD by Rafi Pecinta Dunia\nWA: 081949980384 • YouTube: @steven-d1k4i"); foot.setGravity(Gravity.CENTER);

        layout.addView(btnPromo); layout.addView(btnSend); layout.addView(btnAkun); layout.addView(btnLogout); layout.addView(foot);
        scroll.addView(layout);
        setContentView(scroll);

        k1.setOnClickListener(v -> Toast.makeText(this, "Kategori: Makanan", Toast.LENGTH_SHORT).show());
        k2.setOnClickListener(v -> Toast.makeText(this, "Kategori: Minuman", Toast.LENGTH_SHORT).show());
        k3.setOnClickListener(v -> Toast.makeText(this, "Kategori: Jajanan", Toast.LENGTH_SHORT).show());
        k4.setOnClickListener(v -> Toast.makeText(this, "Kategori: Paket Hemat - Diskon 40%", Toast.LENGTH_SHORT).show());
        btnPromo.setOnClickListener(v -> showPromo());
        btnSend.setOnClickListener(v -> {
            Toast.makeText(this, "RAFI SEND - Kirim Barang via WA...", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6281949980384?text=Halo%20RAFI%20SEND!%20Saya%20mau%20kirim%20barang%20dari%20Surabaya")));
        });
        btnAkun.setOnClickListener(v -> showAkun());
        btnLogout.setOnClickListener(v -> showLogin());
    }

    void pesanWA(String nama, String harga) {
        Toast.makeText(this, "Pesan " + nama + " - " + harga, Toast.LENGTH_SHORT).show();
        String msg = "Halo RAFI FOOD! Saya mau pesan: " + nama + " (" + harga + ")%0AAlamat: %0ANama: " + namaUser;
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6281949980384?text=" + msg)));
    }

    void showPromo() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL); l.setBackgroundColor(Color.parseColor("#F0FDF4"));
        l.setPadding(40,80,40,40); l.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView t = new TextView(this); t.setText("🎁 PROMO RAFI FOOD"); t.setTextSize(28); t.setTextColor(Color.parseColor("#16A34A")); t.setGravity(Gravity.CENTER);
        TextView s = new TextView(this);
        s.setText("\n🔥 RAFIHEMAT - Diskon 40%\nMin. belanja Rp 25.000\n\n🛵 GRATIS ONGKIR\nMin. belanja Rp 25.000\n\n🍔 BELI 2 GRATIS 1\nAyam Geprek setiap Jumat\n\nBerlaku di Surabaya!");
        s.setTextSize(17); s.setBackgroundColor(Color.WHITE); s.setPadding(30,30,30,30); s.setGravity(Gravity.CENTER);
        Button back = new Button(this); back.setText("⬅ KEMBALI KE BERANDA");
        back.setBackgroundColor(Color.parseColor("#111827")); back.setTextColor(Color.WHITE);
        l.addView(t); l.addView(s); l.addView(back); setContentView(l);
        back.setOnClickListener(v -> showHome());
    }

    void showAkun() {
        LinearLayout l = new LinearLayout(this);
        l.setOrientation(LinearLayout.VERTICAL); l.setBackgroundColor(Color.parseColor("#F0FDF4"));
        l.setPadding(40,80,40,40); l.setGravity(Gravity.CENTER_HORIZONTAL);
        TextView t = new TextView(this); t.setText("👤 AKUN SAYA"); t.setTextSize(28); t.setTextColor(Color.parseColor("#F59E0B")); t.setGravity(Gravity.CENTER);
        TextView s = new TextView(this);
        s.setText("\nNama: " + namaUser + "\nKota: Surabaya\nWA: 081949980384\nYouTube: @steven-d1k4i\n\nTotal Pesanan: 12\nPoin RAFI: 250 Poin\nLevel: Member Gold ⭐");
        s.setTextSize(17); s.setBackgroundColor(Color.WHITE); s.setPadding(30,30,30,30); s.setGravity(Gravity.CENTER);
        Button back = new Button(this); back.setText("⬅ KEMBALI");
        back.setBackgroundColor(Color.parseColor("#111827")); back.setTextColor(Color.WHITE);
        l.addView(t); l.addView(s); l.addView(back); setContentView(l);
        back.setOnClickListener(v -> showHome());
    }
}
