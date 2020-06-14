package com.example.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Cases extends AppCompatActivity {


    TextView total, death, recover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cases);

        total = findViewById(R.id.TotalCases);
        death = findViewById(R.id.Deaths);
        recover = findViewById(R.id.Recovered);
        getData();


    }

    public void getData(){

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.covid19api.com/world/total";

        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONObject jsonObject = new JSONObject(response.toString());
                    String num = jsonObject.getString("TotalConfirmed");
                    String dea = jsonObject.getString("TotalDeaths");
                    String reco = jsonObject.getString("TotalRecovered");

                    total.setText(num);
                    death.setText(dea);
                    recover.setText(reco);

                } catch (JSONException e) {
                    Log.e("error marker", e.toString());
                }
            }

            } , new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(Cases.this, error.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });

            queue.add(jsonRequest);

    }
}