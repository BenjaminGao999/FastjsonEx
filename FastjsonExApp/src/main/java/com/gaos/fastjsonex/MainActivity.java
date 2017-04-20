package com.gaos.fastjsonex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.fastjson.JSON;
import com.gaos.fastjsonex.bean.Student;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btnFjEx = (Button) findViewById(R.id.btn_fjex);
        btnFjEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fastjsonEx();
            }
        });
    }

    private void fastjsonEx() {
        //javabean to json
//        Student li = new Student("li", "007");

//        Student li = new Student();
//        li.setName("li");
//        li.setNum("007");
//        String toJSONString = JSON.toJSONString(li);
//        Log.i(TAG, "fastjsonEx: tojsonString = " + toJSONString);

        //jsonString to javabean
        String preJsonString = "{\"name\":\"li\",\"num\":\"007\"}";
        Student student = JSON.parseObject(preJsonString, Student.class);
        Log.i(TAG, "fastjsonEx: json to javabean" + student.toString());
    }
}
