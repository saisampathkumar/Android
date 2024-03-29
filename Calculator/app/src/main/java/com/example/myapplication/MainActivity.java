package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
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
        Button b = (Button)findViewById(R.id.one);
        CharSequence text = result.getText();
        result.setText(text+"1");
    }
    public void setTwo(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"2");
    }
    public void setThree(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"3");
    }
    public void setFour(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"4");
    }
    public void setFive(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"5");
    }
    public void setSix(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"6");
    }
    public void setSeven(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"7");
    }
    public void setEight(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"8");
    }
    public void setNine(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"9");
    }
    public void setZero(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"0");
    }
    public void setDoubleZero(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+"00");
    }
    public void setDot(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        CharSequence text = result.getText();
        result.setText(text+".");
    }
    public void divide(View v){
        TextView result = (TextView)findViewById(R.id.Output);
        TextView result2 = (TextView)findViewById(R.id.Output2);
        CharSequence text = result2.getText();
        CharSequence text2 = result.getText();
        if((result.getText() == null || result.getText() == "" )&& (result2.getText() == null || result2.getText() == "")){
            Toast.makeText(getApplicationContext(),"Please enter a number " , Toast.LENGTH_SHORT).show();
        }else if((text2 != null)&&(text2 != "") && (text != null) && (text != "")){
            CharSequence elem1 = text.subSequence(0,text.length()-1);
            element1 = Float.parseFloat((String) elem1);
            element2 = Float.parseFloat((String) text2);
            CharSequence check = text.subSequence(text.length()-1, text.length());
            if(check.equals("/")){
                float a = element1/element2;
                result.setText("");
                result2.setText(""+a+"/");
            }
            else if(check.equals("x")){
                float a = element1*element2;
                result.setText("");
                result2.setText(""+a+"/");
            }
            else if(check.equals("-")){
                float a = element1-element2;
                result.setText("");
                result2.setText(""+a+"/");
            }
            else if(check.equals("+")) {
                float a = element1+element2;
                result.setText("");
                result2.setText(""+a+"/");
            }
        }
        else if( (text2 != null)&&(text2 != "")){
            result2.setText(text2+"/");
            result.setText("");
        }else if((text != null) && (text != "")){
            if(text.length()>1){
                CharSequence temp = null;
                CharSequence check = text.subSequence(text.length()-1, text.length());
                if(check.equals("/") || check.equals("+") || check.equals("-") || check.equals("x"))
                {
                    if(text2 == null || text2 == ""){
                        temp = text.subSequence(0,text.length()-1);
                        result2.setText(temp+"/");
                        result.setText("");
                    }else
                        equals(v);
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
        }else if((text2 != null)&&(text2 != "") && (text != null) && (text != "")){
            CharSequence elem1 = text.subSequence(0,text.length()-1);
            element1 = Float.parseFloat((String) elem1);
            element2 = Float.parseFloat((String) text2);
            CharSequence check = text.subSequence(text.length()-1, text.length());
            if(check.equals("/")){
                float a = element1/element2;
                result.setText("");
                result2.setText(""+a+"x");
            }
            else if(check.equals("x")){
                float a = element1*element2;
                result.setText("");
                result2.setText(""+a+"x");
            }
            else if(check.equals("-")){
                float a = element1-element2;
                result.setText("");
                result2.setText(""+a+"x");
            }
            else if(check.equals("+")) {
                float a = element1+element2;
                result.setText("");
                result2.setText(""+a+"x");
            }
        }
        else if( (text2 != null)&&(text2 != "")){
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
        }else if((text2 != null)&&(text2 != "") && (text != null) && (text != "")){
            CharSequence elem1 = text.subSequence(0,text.length()-1);
            element1 = Float.parseFloat((String) elem1);
            element2 = Float.parseFloat((String) text2);
            CharSequence check = text.subSequence(text.length()-1, text.length());
            if(check.equals("/")){
                float a = element1/element2;
                result.setText("");
                result2.setText(""+a+"+");
            }
            else if(check.equals("x")){
                float a = element1*element2;
                result.setText("");
                result2.setText(""+a+"+");
            }
            else if(check.equals("-")){
                float a = element1-element2;
                result.setText("");
                result2.setText(""+a+"+");
            }
            else if(check.equals("+")) {
                float a = element1+element2;
                result.setText("");
                result2.setText(""+a+"+");
            }

        }else if( (text2 != null)&&(text2 != "")){
            result2.setText(text2+"+");
            result.setText("");
        }else if((text != null) && (text != "")){
            if(text.length()>1){
                CharSequence temp = null;
                CharSequence check = text.subSequence(text.length()-1, text.length());
                if(check.equals("/") || check.equals("+") || check.equals("-") || check.equals("x"))
                {
                    if(text2 == null || text2 == ""){
                        temp = text.subSequence(0,text.length()-1);
                        result2.setText(temp+"+");
                        result.setText("");
                    }else
                        equals(v);
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
        }else if((text2 != null)&&(text2 != "") && (text != null) && (text != "")){
            CharSequence elem1 = text.subSequence(0,text.length()-1);
            element1 = Float.parseFloat((String) elem1);
            element2 = Float.parseFloat((String) text2);
            CharSequence check = text.subSequence(text.length()-1, text.length());
            if(check.equals("/")){
                float a = element1/element2;
                result.setText("");
                result2.setText(""+a+"-");
            }
            else if(check.equals("x")){
                float a = element1*element2;
                result.setText("");
                result2.setText(""+a+"-");
            }
            else if(check.equals("-")){
                float a = element1-element2;
                result.setText("");
                result2.setText(""+a+"-");
            }
            else if(check.equals("+")) {
                float a = element1+element2;
                result.setText("");
                result2.setText(""+a+"-");
            }
        }else if( (text2 != null)&&(text2 != "")){
            result2.setText(text2+"-");
            result.setText("");
        }else if((text != null) && (text != "")){
            if(text.length()>1){
                CharSequence temp = null;
                CharSequence check = text.subSequence(text.length()-1, text.length());
                if(check.equals("/") || check.equals("+") || check.equals("-") || check.equals("x"))
                {
                    if(text2 == null || text2 == ""){
                        temp = text.subSequence(0,text.length()-1);
                        result2.setText(temp+"-");
                        result.setText("");
                    }else
                        equals(v);
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
