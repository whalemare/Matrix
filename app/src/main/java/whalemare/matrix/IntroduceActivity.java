package whalemare.matrix;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//import org.w3c.dom.Text;

public class IntroduceActivity extends Activity {

    int det; // вычисленный определитель матрицы
    TextView field11, field12, field13,
             field21, field22, field23,
             field31, field32, field33;
    TextView twDet;
    int[][] matrix = new int[3][3]; // TODO сюда вместо [][] передаетс€ размерность матрицы

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduce_layout);

        field11 = (TextView) findViewById(R.id.textView);
        field12 = (TextView) findViewById(R.id.textView2);
        field13 = (TextView) findViewById(R.id.textView3);
        field21 = (TextView) findViewById(R.id.textView5);
        field22 = (TextView) findViewById(R.id.textView6);
        field23 = (TextView) findViewById(R.id.textView7);
        field31 = (TextView) findViewById(R.id.textView8);
        field32 = (TextView) findViewById(R.id.textView9);
        field33 = (TextView) findViewById(R.id.textView10);
        twDet = (TextView) findViewById(R.id.twDet);

        for (int i=0; i<=2; i++) // ¬се элементы матрицы = 0
            for (int j=0; j<=2; j++)
            {
                matrix[i][j]=0;
                System.out.println("["+i+"]["+j+"] = " + matrix[i][j]);
            }

    }


    public void btnClick(View view)
    {
        switch (view.getId())
        {
            case R.id.textView:
                matrix[0][0]++;
                field11.setText("" + matrix[0][0]);
                break;
            case R.id.textView2:
                matrix[0][1]++;
                field12.setText("" + matrix[0][1]);
                break;
            case R.id.textView3:
                matrix[0][2]++;
                field13.setText("" + matrix[0][2]);
                break;

            case R.id.textView5:
                matrix[1][0]++;
                field21.setText("" + matrix[1][0]);
                break;
            case R.id.textView6:
                matrix[1][1]++;
                field22.setText("" + matrix[1][1]);
                break;
            case R.id.textView7:
                matrix[1][2]++;
                field23.setText("" + matrix[1][2]);
                break;

            case R.id.textView8:
                matrix[2][0]++;
                field31.setText("" + matrix[2][0]);
                break;
            case R.id.textView9:
                matrix[2][1]++;
                field32.setText("" + matrix[2][1]);
                break;
            case R.id.textView10:
                matrix[2][2]++;
                field33.setText("" + matrix[2][2]);
                break;

            //
            case R.id.twDet:
                det  =  matrix[0][0]*matrix[1][1]*matrix[2][2]+ // посчитали определитель
                        matrix[0][1]*matrix[1][2]*matrix[2][0]+
                        matrix[0][2]*matrix[1][0]*matrix[2][1]-
                        matrix[0][2]*matrix[1][1]*matrix[2][0]-
                        matrix[0][0]*matrix[1][2]*matrix[2][1]-
                        matrix[0][1]*matrix[1][0]*matrix[2][2];
                System.out.println(matrix[0][0]+"*"+matrix[1][1]+"*"+matrix[2][2]+"+"
                        +matrix[0][1]+"*"+matrix[1][2]+"*"+matrix[2][0]+"+"+
                        matrix[0][2]+"*"+matrix[1][0]+"*"+matrix[2][1]+"-"+
                        matrix[0][2]+"*"+matrix[1][1]+"*"+matrix[2][0]+"-"+
                        matrix[0][0]+"*"+matrix[1][2]+"*"+matrix[2][1]+"-"+
                        matrix[0][1]+"*"+matrix[1][0]+"*"+matrix[2][2]);
                twDet.setText("" + det);
        }
    }
}
