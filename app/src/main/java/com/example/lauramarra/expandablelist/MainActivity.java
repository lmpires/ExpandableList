package com.example.lauramarra.expandablelist;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                Intent launchBrowser;
                Uri uriUrl;

                // TODO Auto-generated method stub

                switch(childPosition){
                    case 0:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 1:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 2:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 3:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 4:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 5:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 6:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 7:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 8:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 9:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;

                    case 10:
                        uriUrl = Uri.parse("https://plus.google.com/107217033654580487496/posts/Eq88mYPGXes");
                        launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                        startActivity(launchBrowser);
                        break;
                }



                /*
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                        */
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("1º Período");
        listDataHeader.add("2º Período");
        listDataHeader.add("3º Período");
        listDataHeader.add("4º Período");
        listDataHeader.add("5º Período");
        listDataHeader.add("6º Período");
        listDataHeader.add("7º Período");
        listDataHeader.add("8º Período");
        listDataHeader.add("9º Período");
        listDataHeader.add("10º Período");
        listDataHeader.add("Eletivas");

        // Adding child data
        List<String> periodo1 = new ArrayList<String>();
        periodo1.add("Cálculo I");
        periodo1.add("Física I");
        periodo1.add("Física Experimental I");
        periodo1.add("Computação I");
        periodo1.add("Química I");


        List<String> periodo2 = new ArrayList<String>();
        periodo2.add("Cálculo II");
        periodo2.add("Física II");
        periodo2.add("Física Experimental II");
        periodo2.add("Computação II");
        periodo2.add("Álgebra Linear II");
        periodo2.add("Circuitos Lógicos");
        periodo2.add("Engenharia e Meio Ambiente");


        List<String> periodo3 = new ArrayList<String>();
        periodo3.add("Cálculo III");
        periodo3.add("Física III");
        periodo3.add("Física Experimental III");
        periodo3.add("Eletrônica I");
        periodo3.add("Métodos Matemáticos");
        periodo3.add("Sistemas Lineares I");

        List<String> periodo4 = new ArrayList<String>();
        periodo4.add("Física IV");
        periodo4.add("Física Experimental IV");
        periodo4.add("Eletrônica II");
        periodo4.add("Algoritmos e Estruturas de Dados");
        periodo4.add("Circuitos Elétricos I");
        periodo4.add("Sistemas Digitais");


        List<String> periodo5 = new ArrayList<String>();
        periodo5.add("Aquitetura de Computadores");
        periodo5.add("Teoria Eletromagnética");
        periodo5.add("Eletrônica III");
        periodo5.add("Circuitos Elétricos II");
        periodo5.add("Sistemas Lineares II");


        List<String> periodo6 = new ArrayList<String>();
        periodo6.add("Comunicações Analógicas");
        periodo6.add("Eletrónica IV");
        periodo6.add("Controle Linear I");
        periodo6.add("Linguagem de Programação");
        periodo6.add("Modelos Probabilísticos");


        List<String> periodo7 = new ArrayList<String>();
        periodo7.add("Comunicações Digitais");
        periodo7.add("Instrumentação e Técnicas de Medidas");
        periodo7.add("Controle Linear II");
        periodo7.add("Processamento de Sinais");
        periodo7.add("Projeto Integrado");
        periodo7.add("Sistemas Operacionais");


        List<String> periodo8 = new ArrayList<String>();
        periodo8.add("Conversão de Energia");


        List<String> periodo9 = new ArrayList<String>();
        periodo9.add("Economia A");

        List<String> periodo10 = new ArrayList<String>();
        periodo10.add("Organização das Indústrias");

        List<String> eletivas = new ArrayList<String>();
        eletivas.add("Organização das Indústrias");

        listDataChild.put(listDataHeader.get(0), periodo1); // Header, Child data
        listDataChild.put(listDataHeader.get(1), periodo2);
        listDataChild.put(listDataHeader.get(2), periodo3);
        listDataChild.put(listDataHeader.get(3), periodo4);
        listDataChild.put(listDataHeader.get(4), periodo5);
        listDataChild.put(listDataHeader.get(5), periodo6);
        listDataChild.put(listDataHeader.get(6), periodo7);
        listDataChild.put(listDataHeader.get(7), periodo8);
        listDataChild.put(listDataHeader.get(8), periodo9);
        listDataChild.put(listDataHeader.get(9), periodo10);
        listDataChild.put(listDataHeader.get(10), eletivas);
    }
}
