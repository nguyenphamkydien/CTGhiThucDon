package vn.edu.uit.ctghithucdon;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by minhthuan on 1/21/2018.
 */


public class MainLogedIn extends AppCompatActivity {
    TextView txtthanhcong;
    String null1;
    String null2;
    TextView txtdanhsachtang1;

    TextView lblban1;
    TextView lblban2;
    TextView lblban3;
    TextView lblban4;
    TextView lblban5;
    TextView lblban6;
    TextView lblban7;
    TextView lblban8;
    TextView lblban9;
    TextView lblban10;
    TextView lblban11;
    TextView lblban12;

    String key;
    String value;
    String nhanhienthi;
    String kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loged_in);
        txtthanhcong = (TextView) findViewById(R.id.txtthanhcong);
        txtdanhsachtang1 = (TextView) findViewById(R.id.txtdanhsachbantang1);
        txtdanhsachtang1.setTextColor(Color.RED);

        lblban1 = (TextView) findViewById(R.id.lblban1);
        lblban1.setTextColor(Color.GREEN);
        lblban2 = (TextView) findViewById(R.id.lblban2);
        lblban2.setTextColor(Color.GREEN);
        lblban3 = (TextView) findViewById(R.id.lblban3);
        lblban3.setTextColor(Color.GREEN);
        lblban4 = (TextView) findViewById(R.id.lblban4);
        lblban4.setTextColor(Color.GREEN);
        lblban5 = (TextView) findViewById(R.id.lblban5);
        lblban5.setTextColor(Color.GREEN);
        lblban6 = (TextView) findViewById(R.id.lblban6);
        lblban6.setTextColor(Color.GREEN);
        lblban7 = (TextView) findViewById(R.id.lblban7);
        lblban7.setTextColor(Color.GREEN);
        lblban8 = (TextView) findViewById(R.id.lblban8);
        lblban8.setTextColor(Color.GREEN);
        lblban9 = (TextView) findViewById(R.id.lblban9);
        lblban9.setTextColor(Color.GREEN);
        lblban10 = (TextView) findViewById(R.id.lblban10);
        lblban10.setTextColor(Color.GREEN);
        lblban11 = (TextView) findViewById(R.id.lblban11);
        lblban11.setTextColor(Color.GREEN);
        lblban12 = (TextView) findViewById(R.id.lblban12);
        lblban12.setTextColor(Color.GREEN);
        Intent info = getIntent();
        Bundle nhan_goi_data_login = info.getExtras();
        // Gói nhận data gồm tên đăng nhập và password nhận từ activity DangNhap thông qua intent info

        String nhanuser = nhan_goi_data_login.getString("user");
        String nhanpass = nhan_goi_data_login.getString("pass");

        nhanuser.trim(); // loại bỏ các ký tự thừa
        nhanpass.trim();

        if (nhanuser.equals("admin") && nhanpass.equals("123456")) {

            Toast.makeText(getApplicationContext(), "                 CHÚC MỪNG BẠN " +"\n"+ "                            "+nhanuser + "\n" + "        ĐÃ ĐĂNG NHẬP THÀNH CÔNG!",
                    Toast.LENGTH_SHORT).show();

        } else {

            // trả về kết quả nếu ko đúng tên đăng nhập và mật khẩu
            null1 = "";
            null2 = "";
            nhan_goi_data_login.putString("back1", null1);
            nhan_goi_data_login.putString("back2", null2);
            info.putExtras(nhan_goi_data_login);
            setResult(Activity.RESULT_OK, info);
            Toast.makeText(getApplicationContext(), "   BẠN ĐÃ ĐĂNG NHẬP SAI" + "\n" + " VUI LÒNG ĐĂNG NHẬP LẠI! ",
                    Toast.LENGTH_SHORT).show();
            finish();

        }
        lblban1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban1 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban1";
                value = "BAN 1";
                truyenban(ban1, key, value);
                startActivityForResult(ban1, 101);
            }
        });

        lblban2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban2 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban2";
                value = "BAN 2";
                truyenban(ban2, key, value);
                startActivityForResult(ban2, 102);
            }
        });
        lblban3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban3 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban3";
                value = "BAN 3";
                truyenban(ban3, key, value);
                startActivityForResult(ban3, 103);
            }
        });
        lblban4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban4 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban4";
                value = "BAN 4";
                truyenban(ban4, key, value);
                startActivityForResult(ban4, 104);
            }
        });
        lblban5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban5 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban5";
                value = "BAN 5";
                truyenban(ban5, key, value);
                startActivityForResult(ban5, 105);
            }
        });
        lblban6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban6 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban6";
                value = "BAN 6";
                truyenban(ban6, key, value);
                startActivityForResult(ban6, 106);
            }
        });
        lblban7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban7 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban7";
                value = "BAN 7";
                truyenban(ban7, key, value);
                startActivityForResult(ban7, 107);
            }
        });
        lblban8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban8 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban8";
                value = "BAN 8";
                truyenban(ban8, key, value);
                startActivityForResult(ban8, 108);
            }
        });
        lblban9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban9 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban9";
                value = "BAN 9";
                truyenban(ban9, key, value);
                startActivityForResult(ban9, 109);
            }
        });
        lblban10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban10 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban10";
                value = "BAN 10";
                truyenban(ban10, key, value);
                startActivityForResult(ban10, 110);
            }
        });
        lblban11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban11 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban11";
                value = "BAN 11";
                truyenban(ban11, key, value);
                startActivityForResult(ban11, 111);
            }
        });
        lblban12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent ban12 = new Intent(MainLogedIn.this, MainOrder.class);
                key = "ban12";
                value = "BAN 12";
                truyenban(ban12, key, value);
                startActivityForResult(ban12, 112);
            }
        });


    }
    private void truyenban(Intent intent, String khoa, String giatri) {
        Bundle truyenban = new Bundle();
        truyenban.putString(key, value);
        intent.putExtras(truyenban);
    }

    // hàm nhận xác nhận bàn nào đã có khách
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode == 101) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi1");

            if (nhanhienthi.equals("1")) {
                lblban1.setBackgroundResource(0x7f020004);
            }
        }



        if ((requestCode == 102) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi2");

            if (nhanhienthi.equals("2")) {
                lblban2.setBackgroundResource(0x7f020004);
            }
        }


        if ((requestCode == 103) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi3");

            if (nhanhienthi.equals("3")) {
                lblban3.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 104) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi3");

            if (nhanhienthi.equals("4")) {
                lblban4.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 105) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi5");

            if (nhanhienthi.equals("5")) {
                lblban5.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 106) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi6");

            if (nhanhienthi.equals("6")) {
                lblban6.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 107) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi7");

            if (nhanhienthi.equals("7")) {
                lblban7.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 108) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi8");

            if (nhanhienthi.equals("8")) {
                lblban8.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 109) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi9");

            if (nhanhienthi.equals("9")) {
                lblban9.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 110) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi10");

            if (nhanhienthi.equals("10")) {
                lblban10.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 111) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi11");

            if (nhanhienthi.equals("11")) {
                lblban11.setBackgroundResource(0x7f020004);
            }
        }

        if ((requestCode == 112) && (resultCode == Activity.RESULT_OK)) {
            Bundle nhan = data.getExtras();
            nhanhienthi = nhan.getString("hienthi12");

            if (nhanhienthi.equals("12")) {
                lblban12.setBackgroundResource(0x7f020004);
            }
        }
    }
}
