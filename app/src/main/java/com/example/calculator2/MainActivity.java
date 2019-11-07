package com.example.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);

        try {
            Button left_button = (Button) findViewById(R.id.left_button);
            left_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("(");
                    } else {
                        txt.setText(txt.getText().toString() + "(");
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button right_button = (Button) findViewById(R.id.right_button);
            right_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText(")");
                    } else {
                        txt.setText(txt.getText().toString() + ")");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button plus_button = (Button) findViewById(R.id.plus_button);
            plus_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("+");
                    } else {
                        txt.setText(txt.getText().toString() + "+");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button zero_button = (Button) findViewById(R.id.zero_button);
            zero_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("0");
                    } else {
                        txt.setText(txt.getText().toString() + "0");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button one_button = (Button) findViewById(R.id.one_button);
            one_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("1");
                    } else {
                        txt.setText(txt.getText().toString() + "1");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button two_button = (Button) findViewById(R.id.two_button);
            two_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("2");
                    } else {
                        txt.setText(txt.getText().toString() + "2");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button three_button = (Button) findViewById(R.id.three_button);
            three_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("3");
                    } else {
                        txt.setText(txt.getText().toString() + "3");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button minus_button = (Button) findViewById(R.id.minus_button);
            minus_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("-");
                    } else {
                        txt.setText(txt.getText().toString() + "-");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button four_button = (Button) findViewById(R.id.four_button);
            four_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("4");
                    } else {
                        txt.setText(txt.getText().toString() + "4");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button five_button = (Button) findViewById(R.id.five_button);
            five_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("5");
                    } else {
                        txt.setText(txt.getText().toString() + "5");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button six_button = (Button) findViewById(R.id.six_button);
            six_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("6");
                    } else {
                        txt.setText(txt.getText().toString() + "6");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button multiplication_button = (Button) findViewById(R.id.multiplication_button);
            multiplication_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("*");
                    } else {
                        txt.setText(txt.getText().toString() + "*");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button seven_button = (Button) findViewById(R.id.seven_button);
            seven_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("7");
                    } else {
                        txt.setText(txt.getText().toString() + "7");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button eight_button = (Button) findViewById(R.id.eight_button);
            eight_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("8");
                    } else {
                        txt.setText(txt.getText().toString() + "8");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button nine_button = (Button) findViewById(R.id.nine_button);
            nine_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("9");
                    } else {
                        txt.setText(txt.getText().toString() + "9");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button division_button = (Button) findViewById(R.id.division_button);
            division_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("/");
                    } else {
                        txt.setText(txt.getText().toString() + "/");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button point_button = (Button) findViewById(R.id.point_button);
            point_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    if (txt.getText().toString().equals("0")) {
                        txt.setText("0.");
                    } else {
                        txt.setText(txt.getText().toString() + ".");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }



        try {
            Button clear_button = (Button) findViewById(R.id.clear_button);
            clear_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    txt.setText("0");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button equal_button = (Button) findViewById(R.id.equal_button);
            equal_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try
                    {
                        String middle = txt.getText().toString();
                        middle= main.Calculator.Recount(middle);
                        List list = Collections.singletonList(main.Calculator.AddStacks(middle));
                        txt.setText(list.toString());
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button sin_button = (Button) findViewById(R.id.sin_button);
            sin_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    double a = Math.toRadians(Double.parseDouble(txt.getText().toString()));
                    String str = "" + Math.sin(a);
                    txt.setText(str);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button cos_button = (Button) findViewById(R.id.cos_button);
            cos_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    double a = Math.toRadians(Double.parseDouble(txt.getText().toString()));
                    String str = "" + Math.cos(a);
                    txt.setText(str);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button back_button = (Button) findViewById(R.id.back_button);
            back_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    String s = txt.getText().toString();
                    s = s.substring(0, s.length() - 1);
                    if (s.length() == 0) {
                        txt.setText("0");
                    } else {
                        txt.setText(s);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Button help_button = (Button) findViewById(R.id.help_button);
            help_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "帮助：\n" + "可以完成简单的加减乘除运算\n" + "更多功能切为横屏\n", Toast.LENGTH_LONG).show();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button btd_button = (Button) findViewById(R.id.btd_button);//二进制转十进制
            btd_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    String data = txt.getText().toString();
                    try {
                        String new_data = Integer.valueOf(data, 2).toString();
                        txt.setText(new_data);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button dtb_button = (Button) findViewById(R.id.dtb_button);//十进制转二进制
            dtb_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try {
                        int num = Integer.parseInt(txt.getText().toString());
                        String s = Integer.toBinaryString(num);
                        txt.setText(s);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button dto_button = (Button) findViewById(R.id.dto_button);//十进制转八进制
            dto_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try {
                        int num = Integer.parseInt(txt.getText().toString());
                        String s = Integer.toOctalString(num);
                        txt.setText(s);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button otd_button = (Button) findViewById(R.id.otd_button);//八进制转十进制
            otd_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try {
                        String data = txt.getText().toString();
                        String new_data = Integer.valueOf(data, 8).toString();
                        txt.setText(new_data);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button dth_button = (Button) findViewById(R.id.dth_button);//十进制转十六进制
            dth_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try {
                        int num = Integer.parseInt(txt.getText().toString());
                        String s = Integer.toHexString(num);
                        txt.setText(s);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button htd_button = (Button) findViewById(R.id.htd_button);//十六进制转十进制
            htd_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try {
                        String data = txt.getText().toString();
                        String new_data = Integer.valueOf(data, 16).toString();
                        txt.setText(new_data);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            Button mmtocm_button = (Button) findViewById(R.id.mmcm_button);
            mmtocm_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try {
                        double new_data = Double.valueOf(txt.getText().toString()) / 10;
                        String s = "" + new_data;
                        txt.setText(s);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Button cmtom_button = (Button) findViewById(R.id.cmm_button);
            cmtom_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView txt = (TextView) findViewById(R.id.txt);
                    try {
                        double new_data = Double.valueOf(txt.getText().toString()) / 100;
                        String s = "" + new_data;
                        txt.setText(s);
                    } catch (Exception e) {
                        e.printStackTrace();
                        txt.setText("ERROR");
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}