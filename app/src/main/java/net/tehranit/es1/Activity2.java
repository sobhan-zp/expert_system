package net.tehranit.es1;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class Activity2 extends Activity {

    public ArrayList<StructNote> notes  = new ArrayList<StructNote>();
    public ArrayAdapter          adapter;
    public int                   conter = 0;
    public String                txt    = "";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        //listview

        //btn sent text
        Button btn_send = (Button) findViewById(R.id.btn_send);
        //txt
        final TextView txt_send = (TextView) findViewById(R.id.txt_send);
        //------------------------
        //action btn
        //------------------------
        btn_send.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                txt = txt_send.getText().toString();
                txt_send.setText("");

                switch (conter) {
                    case 0:
                        printLs(1, txt);
                        new Handler().postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                printLs(2, "سلام :) \n پایه بازی هستی ؟");
                            }
                        }, 1200);

                        conter++;
                        break;
                    case 1:
                        if (txt.equals("yes") || txt.equals("ye") || txt.equals("y") || txt.equals("are") || txt.equals("bale") || txt.equals("بله") || txt.equals("آره")) {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "از بین حیوانات زیر یکی را انتخاب کن \n 1- زرافه \n 2- فیل \n 3- اسب آبی \n 4- کرگدن \n 5- موش \n 6- سنجاب \n انتخاب کردی ؟");
                                }
                            }, 1200);

                            conter++;
                            break;
                        } else {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "پس هیچی");
                                }
                            }, 1200);

                            conter = 0;
                            break;
                        }
                    case 2:
                        if (txt.equals("yes") || txt.equals("ye") || txt.equals("y") || txt.equals("are") || txt.equals("bale") || txt.equals("بله") || txt.equals("آره")) {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "آیا این حیونه خیلی بزرکه ؟");
                                }
                            }, 1200);
                            conter++;
                            break;
                        } else {
                            printLs(1, txt + "no");
                            break;
                        }
                    case 3:
                        if (txt.equals("yes") || txt.equals("ye") || txt.equals("y") || txt.equals("are") || txt.equals("bale") || txt.equals("بله") || txt.equals("آره")) {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "گردن این حیونه خیلی درازه ؟ :|");
                                }
                            }, 1200);
                            conter = 4;
                            break;
                        } else {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "این حیونه زیاد جیغ جیغ میکنه :O ؟");
                                }
                            }, 1200);
                            conter = 7;
                            break;

                        }
                    case 4:
                        if (txt.equals("yes") || txt.equals("ye") || txt.equals("y") || txt.equals("are") || txt.equals("bale") || txt.equals("بله") || txt.equals("آره")) {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "فهمیدم ... زرافه است");
                                }
                            }, 1200);
                            conter = 0;
                            break;
                            //zarafe
                        } else {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "این حیونه خرطوم داره :D ؟");
                                }
                            }, 1200);
                            conter = 5;
                            break;
                        }
                    case 5:
                        if (txt.equals("yes") || txt.equals("ye") || txt.equals("y") || txt.equals("are") || txt.equals("bale") || txt.equals("بله") || txt.equals("آره")) {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "فهمیدم فیله ...");
                                }
                            }, 1200);
                            conter = 0;
                            break;
                            //fil
                        } else {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "دوست داره تو آب زندگی کنه ؟");
                                }
                            }, 1200);
                            conter = 6;
                            break;
                        }
                    case 6:
                        if (txt.equals("yes") || txt.equals("ye") || txt.equals("y") || txt.equals("are") || txt.equals("bale") || txt.equals("بله") || txt.equals("آره")) {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "فهمیدم اسب آبیه");
                                }
                            }, 1200);
                            conter = 0;
                            break;
                            //asb abi
                        } else {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "فهمیدم کرگدنه ");
                                }
                            }, 1200);
                            conter = 0;
                            break;
                            //kargadan
                        }
                    case 7:
                        if (txt.equals("yes") || txt.equals("ye") || txt.equals("y") || txt.equals("are") || txt.equals("bale") || txt.equals("بله") || txt.equals("آره")) {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "فهمیدم موشه گوگوری مگوری");
                                }
                            }, 1200);
                            conter = 0;
                            break;
                            //asb abi
                        } else {
                            printLs(1, txt);
                            new Handler().postDelayed(new Runnable() {

                                @Override
                                public void run() {
                                    printLs(2, "فهمیدم سنجابه");
                                }
                            }, 1200);
                            conter = 0;
                            break;
                            //kargadan
                        }

                }
            }
        });

    }


    //------------------------
    //chape list view
    //------------------------
    public void printLs(int x, final String y) {
        ListView lstContent = (ListView) findViewById(R.id.lstContent);
        adapter = new AdapterNote(notes);
        lstContent.setAdapter(adapter);
        final StructNote note = new StructNote();

        //user
        if (x == 1) {
            note.done = true;
            note.title = "کاربر";
            note.description = y;
            notes.add(note);
        }
        //system
        if (x == 2) {
            note.done = false;
            note.title = "میمون خبره";
            note.description = y;
            notes.add(note);
        }

        adapter.notifyDataSetChanged();
        lstContent.setSelection(adapter.getCount() - 1);

    }

}