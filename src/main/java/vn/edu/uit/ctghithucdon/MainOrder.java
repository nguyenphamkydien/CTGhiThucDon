package vn.edu.uit.ctghithucdon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by minhthuan on 1/21/2018.
 */

public class MainOrder extends AppCompatActivity {
    String arrSL[]={"","1","2","3","4","5","6","7","8"};
    String arrcaphe[]={"", "Ca Phe Da", "Cà Phê Sữa", "Cà Phê Chồn", "Cà Phê Rum", "Capuchino", "Expresso"};
    String arrsinhto[]= {"", "Sinh Tố Bơ", "Sinh Tố Dừa", "Sinh Tố Mãng Cầu"};
    String arrthuoc[] = {"", "555", "Marboro", "Caraven", "JET"};
    String arrkhac[] = {"", "Nước Suối", "La Hán Quả", "Lipton Đá", "Lipton Nóng", "Trái Cây Đĩa"};
    String arrnuocep[] = {"", "Đá Chanh", "Cam Vắt", "Chanh Dây", "Rau Má", "Đá Me"};
    String arrnuocngot[] = {"", "CoCa Cola", "PepSi", "Sting", "Xá Xị", "Twister"};
    TextView txtcaphe;
    TextView txtslcaphe;
    TextView txtsinhto;
    TextView txtslsinhto;
    TextView txtthuocla;
    TextView txtslthuocla;
    TextView txtkhac;
    TextView txtslkhac;
    TextView txtnuocep;
    TextView txtslnuocep;
    TextView txtnuocngot;
    TextView txtslnuocngot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        //caphe
        txtcaphe =(TextView) findViewById(R.id.txtcaphe);
        Spinner spincaphe=(Spinner) findViewById(R.id.spnlistcoffee);
        ArrayAdapter<String> adaptercaphe=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrcaphe
                );
        adaptercaphe.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spincaphe.setAdapter(adaptercaphe);
        spincaphe.setOnItemSelectedListener(new MyProcessEventCaphe());
        txtslcaphe =(TextView) findViewById(R.id.txtslcaphe);
        Spinner spinslcaphe=(Spinner) findViewById(R.id.spnsoluongcoffee);
        ArrayAdapter<String> adapterslcaphe=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrSL
                );
        adapterslcaphe.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinslcaphe.setAdapter(adapterslcaphe);
        spinslcaphe.setOnItemSelectedListener(new MyProcessEventSLCaPhe());
        //sinh to
        txtsinhto =(TextView) findViewById(R.id.txtsinhto);
        Spinner spinsinhto=(Spinner) findViewById(R.id.spnlistsinhto);
        ArrayAdapter<String> adaptersinhto=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrsinhto
                );
        adaptersinhto.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinsinhto.setAdapter(adaptersinhto);
        spinsinhto.setOnItemSelectedListener(new MyProcessEventSinhTo());
        txtslsinhto =(TextView) findViewById(R.id.txtslsinhto);
        Spinner spinslsinhto=(Spinner) findViewById(R.id.spnsoluongsinhto);
        ArrayAdapter<String> adapterslsinhto=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrSL
                );
        adapterslsinhto.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinslsinhto.setAdapter(adapterslsinhto);
        spinslsinhto.setOnItemSelectedListener(new MyProcessEventSLSinhTo());
        //thuốc lá
        txtthuocla =(TextView) findViewById(R.id.txtthuocla);
        Spinner spinthuocla=(Spinner) findViewById(R.id.spnlistthuoc);
        ArrayAdapter<String> adapterthuocla=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrthuoc
                );
        adapterthuocla.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinthuocla.setAdapter(adapterthuocla);
        spinthuocla.setOnItemSelectedListener(new MyProcessEventThuocLa());
        txtslthuocla =(TextView) findViewById(R.id.txtslthuocla);
        Spinner spinslthuocla=(Spinner) findViewById(R.id.spnlistsoluongthuoc);
        ArrayAdapter<String> adapterslthuocla=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrSL
                );
        adapterslthuocla.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinslthuocla.setAdapter(adapterslthuocla);
        spinslthuocla.setOnItemSelectedListener(new MyProcessEventSLThuocLa());
        //khác
        txtkhac =(TextView) findViewById(R.id.txtkhac);
        Spinner spinkhac=(Spinner) findViewById(R.id.spnlistkhac);
        ArrayAdapter<String> adapterkhac=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrkhac
                );
        adapterkhac.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinkhac.setAdapter(adapterkhac);
        spinkhac.setOnItemSelectedListener(new MyProcessEventKhac());
        txtslkhac =(TextView) findViewById(R.id.txtslkhac);
        Spinner spinslkhac=(Spinner) findViewById(R.id.spnsoluongkhac);
        ArrayAdapter<String> adapterslkhac=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrSL
                );
        adapterslkhac.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinslkhac.setAdapter(adapterslkhac);
        spinslkhac.setOnItemSelectedListener(new MyProcessEventSLKhac());
        //nước ép
        txtnuocep =(TextView) findViewById(R.id.txtnuocep);
        Spinner spinnuocep=(Spinner) findViewById(R.id.spnlistnuocep);
        ArrayAdapter<String> adapternuocep=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrnuocep
                );
        adapternuocep.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinnuocep.setAdapter(adapternuocep);
        spinnuocep.setOnItemSelectedListener(new MyProcessEventNuocEp());
        txtslnuocep =(TextView) findViewById(R.id.txtslnuocep);
        Spinner spinslnuocep=(Spinner) findViewById(R.id.spnsoluongnuocep);
        ArrayAdapter<String> adapterslnuocep=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrSL
                );
        adapterslnuocep.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinslnuocep.setAdapter(adapterslnuocep);
        spinslnuocep.setOnItemSelectedListener(new MyProcessEventSLNuocEp());
        //nước ngọt
        txtnuocngot =(TextView) findViewById(R.id.txtnuocngot);
        Spinner spinnuocngot=(Spinner) findViewById(R.id.spnlistnuocngot);
        ArrayAdapter<String> adapternuocngot=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrnuocngot
                );
        adapternuocngot.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinnuocngot.setAdapter(adapternuocngot);
        spinnuocngot.setOnItemSelectedListener(new MyProcessEventNuocNgot());
        txtslnuocngot =(TextView) findViewById(R.id.txtslnuocngot);
        Spinner spinslnuocngot=(Spinner) findViewById(R.id.spnlistsoluongnuocngot);
        ArrayAdapter<String> adapterslnuocngot=new ArrayAdapter<String>
                (
                        this,
                        android.R.layout.simple_spinner_item,
                        arrSL
                );
        adapterslnuocngot.setDropDownViewResource
                (android.R.layout.simple_list_item_single_choice);
        spinslnuocngot.setAdapter(adapterslnuocngot);
        spinslnuocngot.setOnItemSelectedListener(new MyProcessEventSLNuocNgot());
        Button btnquayve = (Button) findViewById(R.id.btnquayve);
        btnquayve.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
    //Class tạo sự kiện caphe
    private class MyProcessEventCaphe implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtcaphe.setText(arrcaphe[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtcaphe.setText("");
        }
    }
    private class MyProcessEventSLCaPhe implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtslcaphe.setText(arrSL[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtslcaphe.setText("");
        }
    }
    //Class tạo sự kiện sinh tố
    private class MyProcessEventSinhTo implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtsinhto.setText(arrsinhto[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtsinhto.setText("");
        }
    }
    private class MyProcessEventSLSinhTo implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtslsinhto.setText(arrSL[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtslsinhto.setText("");
        }
    }
    //Class tạo sự kiện thuốc lá
    private class MyProcessEventThuocLa implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtthuocla.setText(arrthuoc[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtthuocla.setText("");
        }
    }
    private class MyProcessEventSLThuocLa implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtslthuocla.setText(arrSL[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtslthuocla.setText("");
        }
    }
    //Class tạo sự kiện khác
    private class MyProcessEventKhac implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtkhac.setText(arrkhac[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtkhac.setText("");
        }
    }
    private class MyProcessEventSLKhac implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtslkhac.setText(arrSL[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtslkhac.setText("");
        }
    }
    //Class tạo sự kiện nước ép
    private class MyProcessEventNuocEp implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtnuocep.setText(arrnuocep[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtnuocep.setText("");
        }
    }
    private class MyProcessEventSLNuocEp implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtslnuocep.setText(arrSL[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtslnuocep.setText("");
        }
    }
    //Class tạo sự kiện nước ngọt
    private class MyProcessEventNuocNgot implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtnuocngot.setText(arrnuocngot[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtnuocngot.setText("");
        }
    }
    private class MyProcessEventSLNuocNgot implements
            AdapterView.OnItemSelectedListener
    {
        //Khi có chọn lựa thì vào hàm này
        public void onItemSelected(AdapterView<?> arg0,
                                   View arg1,
                                   int arg2,
                                   long arg3) {
            //arg2 là phần tử được chọn trong data source
            txtslnuocngot.setText(arrSL[arg2]);
        }
        //Nếu không chọn gì cả
        public void onNothingSelected(AdapterView<?> arg0) {
            txtslnuocngot.setText("");
        }
    }
}