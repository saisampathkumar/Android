# PICTURE OF MAIN SCREEN:
<img src="https://github.com/saisampathkumar/Android/blob/master/Calculator/Screenshot_20191104-003139.jpg" alt="Screen Shot" style="width:200px;">


# HERE IS THE JAVA CODE FOR THE CALCULATOR APP

```package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    float element1 = 0;
    float element2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setOne(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"1";
        result.setText(te);
    }
    public void setTwo(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"2";
        result.setText(te);
    }
    public void setThree(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"3";
        result.setText(te);
    }
    public void setFour(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"4";
        result.setText(te);
    }
    public void setFive(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"5";
        result.setText(te);
    }
    public void setSix(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"6";
        result.setText(te);
    }
    public void setSeven(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"7";
        result.setText(te);
    }
    public void setEight(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"8";
        result.setText(te);
    }
    public void setNine(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"9";
        result.setText(te);
    }
    public void setZero(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"0";
        result.setText(te);
    }
    public void setDoubleZero(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+"00";
        result.setText(te);
    }
    public void setDot(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        String te = text.toString()+".";
        result.setText(te);
    }
    public void divide(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        TextView result2 = (TextView)findViewById(R.id.Output2);
        CharSequence text = result2.getText();
        CharSequence text2 = result.getText();
        if((result.getText() == null || result.getText() == "" )&& (result2.getText() == null || result2.getText() == "")){
            Toast.makeText(getApplicationContext(),"Please enter a number " , Toast.LENGTH_SHORT).show();
        }else if( (text2 != null)&&(text2 != "")){
            result2.setText(text2+"/");
            result.setText("");
        }else if((text != null) && (text != "")){
            if(text.length()>1){
                CharSequence temp = null;
                CharSequence check = text.subSequence(text.length()-1, text.length());
                if(check.equals("/") || check.equals("+") || check.equals("-") || check.equals("x"))
                {
                    temp = text.subSequence(0,text.length()-1);
                    result2.setText(temp+"/");
                    result.setText("");
                }
                else {
                    result2.setText(text+"/");
                    result.setText("");
                }
            }
            else{
                result2.setText(text+"/");
                result.setText("");
            }
        }
    }
    public void multiply(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        TextView result2 = (TextView)findViewById(R.id.Output2);
        CharSequence text = result2.getText();
        CharSequence text2 = result.getText();
        if((result.getText() == null || result.getText() == "" )&& (result2.getText() == null || result2.getText() == "")){
            Toast.makeText(getApplicationContext(),"Please enter a number " , Toast.LENGTH_SHORT).show();
        }else if( (text2 != null)&&(text2 != "")){
            result2.setText(text2+"x");
            result.setText("");
        }else if((text != null) && (text != "")){
            if(text.length()>1){
                CharSequence temp = null;
                CharSequence check = text.subSequence(text.length()-1, text.length());
                if(check.equals("/") || check.equals("+") || check.equals("-") || check.equals("x"))
                {
                    temp = text.subSequence(0,text.length()-1);
                    result2.setText(temp+"x");
                    result.setText("");
                }
                else {
                    result2.setText(text+"x");
                    result.setText("");
                }
            }
            else{
                result2.setText(text+"x");
                result.setText("");
            }
        }
    }
    public void plus(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        TextView result2 = (TextView)findViewById(R.id.Output2);
        CharSequence text = result2.getText();
        CharSequence text2 = result.getText();
        if((result.getText() == null || result.getText() == "" )&& (result2.getText() == null || result2.getText() == "")){
            Toast.makeText(getApplicationContext(),"Please enter a number " , Toast.LENGTH_SHORT).show();
        }else if( (text2 != null)&&(text2 != "")){
            result2.setText(text2+"+");
            result.setText("");
        }else if((text != null) && (text != "")){
            if(text.length()>1){
                CharSequence temp = null;
                CharSequence check = text.subSequence(text.length()-1, text.length());
                if(check.equals("/") || check.equals("+") || check.equals("-") || check.equals("x"))
                {
                    temp = text.subSequence(0,text.length()-1);
                    result2.setText(temp+"+");
                    result.setText("");
                }
                else {
                    result2.setText(text+"+");
                    result.setText("");
                }
            }
            else{
                result2.setText(text+"+");
                result.setText("");
            }
        }
    }
    public void minus(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        TextView result2 = (TextView)findViewById(R.id.Output2);
        CharSequence text = result2.getText();
        CharSequence text2 = result.getText();
        if((result.getText() == null || result.getText() == "" )&& (result2.getText() == null || result2.getText() == "")){
            Toast.makeText(getApplicationContext(),"Please enter a number " , Toast.LENGTH_SHORT).show();
        }else if( (text2 != null)&&(text2 != "")){
            result2.setText(text2+"-");
            result.setText("");
        }else if((text != null) && (text != "")){
            if(text.length()>1){
                CharSequence temp = null;
                CharSequence check = text.subSequence(text.length()-1, text.length());
                if(check.equals("/") || check.equals("+") || check.equals("-") || check.equals("x"))
                {
                    temp = text.subSequence(0,text.length()-1);
                    result2.setText(temp+"-");
                    result.setText("");
                }
                else {
                    result2.setText(text+"-");
                    result.setText("");
                }
            }
            else{
                result2.setText(text+"-");
                result.setText("");
            }
        }
    }
    public void clear(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        TextView result2 = (TextView)findViewById(R.id.Output2);
        if((result.getText() == null || result.getText() == "" )&& (result2.getText() == null || result2.getText() == "")){
            Toast.makeText(getApplicationContext(),"It is already Clear" , Toast.LENGTH_SHORT).show();
        }else{
            result.setText("");
            result2.setText("");
            element2 = 0;
            element1 = 0;
        }
    }
    public void equals(View v){
        TextView result1 = (TextView)findViewById(R.id.Output2);
        TextView result2 = (TextView)findViewById(R.id.Output);
        CharSequence text1 = result1.getText();
        CharSequence text2 = result2.getText();
        if((result2.getText() == null || result2.getText() == "" || result2.getText() == "0") ){
            result2.setText("0");
            result1.setText("");
        }
        else if((result1.getText() == null || result1.getText() == "")){
            result2.setText("0");
            result1.setText("");
        }
        else{
            CharSequence elem1 = text1.subSequence(0,text1.length()-1);
            element1 = Float.parseFloat((String) elem1);
            element2 = Float.parseFloat((String) text2);
            CharSequence check = text1.subSequence(text1.length()-1, text1.length());
            if(check.equals("/")){
                float a = element1/element2;
                result2.setText("");
                result1.setText(""+a);
            }
            else if(check.equals("x")){
                float a = element1*element2;
                result2.setText("");
                result1.setText(""+a);
            }
            else if(check.equals("-")){
                float a = element1-element2;
                result2.setText("");
                result1.setText(""+a);
            }
            else if(check.equals("+")) {
                float a = element1 + element2;
                result2.setText("");
                result1.setText("" + a);
            }
        }
    }
    public void delete(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        if(result.getText() == null || result.getText() == ""){
            Toast.makeText(getApplicationContext(),"Screen is clear" , Toast.LENGTH_SHORT).show();
        }else
            result.setText(""+text.subSequence(0,text.length()-1));
    }
}
```
# HERE IS THE XML CODE FOR LAYOUTS:

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/Output2"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#FF5722"
        android:gravity="bottom|end"
        android:textColor="@android:color/black"
        android:textSize="90sp"
        app:layout_constraintBottom_toTopOf="@+id/Output"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/Output"
        android:layout_width="0dp"
        android:layout_height="100dp"
        android:background="#FF5722"
        android:gravity="bottom|end"
        android:textColor="@android:color/black"
        android:textSize="60sp"
        app:layout_constraintBottom_toTopOf="@+id/tableLayout"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <TableLayout
        android:id="@+id/tableLayout"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:foregroundGravity="bottom|center_vertical"
        android:gravity="bottom|center_horizontal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <TableRow
            android:layout_width="match_parent"
            android:layout_height="20dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/Brac"
                android:layout_weight="1"
                android:textColor="#FFFFFF"
                android:textSize="24sp"
                android:layout_height="100dp"
                android:layout_width="match_parent"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:text="@string/brace1" />

            <Button
                android:id="@+id/Brace2"
                android:layout_weight="1"
                android:textColor="#FFFFFF"
                android:textSize="24sp"
                android:layout_width="match_parent"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_height="100dp"
                android:text="@string/brac2" />

            <Button
                android:id="@+id/C"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="match_parent"
                android:layout_height="100dp"

                android:layout_weight="1"
                android:onClick="clear"
                android:shadowColor="#00BCD4"
                android:text="@string/clear"
                android:textColor="#FFFFFF"
                android:textColorHighlight="#FD0000"
                android:textColorLink="#00FF0000"
                android:textSize="24sp" />

            <Button
                android:id="@+id/Delete"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="match_parent"
                android:layout_height="100dp"
                android:layout_weight="1"

                android:onClick="delete"
                android:text="@string/del"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />

            <Button
                android:id="@+id/Divide"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="match_parent"
                android:layout_height="100dp"

                android:layout_weight="1"
                android:onClick="divide"
                android:text="@string/div"
                android:textColor="#FFFFFF"
                android:textSize="24sp" />
        </TableRow>

        <TableRow
            android:layout_width="match_parent"
            android:layout_height="20dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/seven"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setSeven"
                android:text="@string/seven"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/eight"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setEight"
                android:text="@string/eight"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/nine"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setNine"
                android:text="@string/nine"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/Multiply"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="multiply"
                android:text="@string/multi"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />
        </TableRow>

        <TableRow
            android:layout_width="match_parent"
            android:layout_height="20dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/four"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setFour"
                android:text="@string/four"
                android:textColor="#FFFFFF"
                android:textSize="30sp"
                tools:layout_editor_absoluteX="33dp"
                tools:layout_editor_absoluteY="281dp" />

            <Button
                android:id="@+id/five"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setFive"
                android:text="@string/five"
                android:textColor="#FFFFFF"
                android:textSize="30sp"
                tools:layout_editor_absoluteX="136dp"
                tools:layout_editor_absoluteY="281dp" />

            <Button
                android:id="@+id/six"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setSix"
                android:text="@string/six"
                android:textColor="#FFFFFF"
                android:textSize="30sp"
                tools:layout_editor_absoluteX="240dp"
                tools:layout_editor_absoluteY="281dp" />

            <Button
                android:id="@+id/minus"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="minus"
                android:text="@string/minus"
                android:textColor="#FFFFFF"
                android:textSize="30sp"
                tools:layout_editor_absoluteX="344dp"
                tools:layout_editor_absoluteY="281dp" />
        </TableRow>

        <TableRow
            android:layout_width="match_parent"
            android:layout_height="20dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/one"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setOne"
                android:text="@string/one"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/two"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setTwo"
                android:text="@string/two"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/three"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setThree"
                android:text="@string/three"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/plus"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="plus"
                android:text="@string/multiply"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />
        </TableRow>

        <TableRow
            android:layout_width="match_parent"
            android:layout_height="20dp"
            android:layout_weight="1">

            <Button
                android:id="@+id/zero"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setZero"
                android:text="@string/zero"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/double_zero"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setDoubleZero"
                android:text="@string/double_zero"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/dot"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="setDot"
                android:text="@string/dot"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />

            <Button
                android:id="@+id/equals"
                style="@style/Widget.AppCompat.Button.Borderless"
                android:layout_width="0dp"
                android:layout_height="100dp"

                android:layout_weight="10"
                android:onClick="equals"
                android:text="@string/equals"
                android:textColor="#FFFFFF"
                android:textSize="30sp" />
        </TableRow>
    </TableLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
```
