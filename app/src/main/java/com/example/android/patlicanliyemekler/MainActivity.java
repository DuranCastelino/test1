package com.example.android.patlicanliyemekler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // the recipe number that is shown on the screen, start from 1 to 5
    int recipeNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * When users click the back button, recipe changes to previous one
     */
    public void backRecipe(View v)
    {
        if(recipeNumber == 2)
        {
            recipeNumber--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.karniyarik);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.karniyarik);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_karniyarik);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_karniyarik);
        }
        else if(recipeNumber == 3)
        {
            recipeNumber--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.imambayildi);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.imambayildi);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_imambayildi);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_imambayildi);
        }
        else if(recipeNumber == 4)
        {
            recipeNumber--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.patlicanoturtma);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.patlicanoturtma);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_patlicanoturtma);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_patlicanoturtma);
        }
        else if(recipeNumber == 5)
        {
            recipeNumber--;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.kurdankebabi);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.kurdankebabi);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_kurdankebabi);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_kurdankebabi);
        }
        else if(recipeNumber == 1)
        {
            Toast toast = Toast.makeText(this, "Başka tarif yok", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    /**
     * When users click the next button, recipe changes to next one
     */
    public void nextRecipe(View v)
    {
        if(recipeNumber == 1)
        {
            recipeNumber++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.imambayildi);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.imambayildi);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_imambayildi);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_imambayildi);
        }
        else if(recipeNumber == 2)
        {
            recipeNumber++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.patlicanoturtma);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.patlicanoturtma);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_patlicanoturtma);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_patlicanoturtma);
        }
        else if(recipeNumber == 3)
        {
            recipeNumber++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.kurdankebabi);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.kurdankebabi);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_kurdankebabi);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_kurdankebabi);
        }
        else if(recipeNumber == 4)
        {
            recipeNumber++;
            ImageView imageField = (ImageView) findViewById(R.id.image_field);
            imageField.setImageResource(R.drawable.guvec);
            TextView nameField = (TextView) findViewById(R.id.name_field);
            nameField.setText(R.string.guvec);
            TextView ingredientField = (TextView) findViewById(R.id.ingredients_field);
            ingredientField.setText(R.string.ingredient_guvec);
            TextView preparationField = (TextView) findViewById(R.id.preparation_field);
            preparationField.setText(R.string.preparation_guvec);
        }
        else if(recipeNumber == 5)
        {
            Toast toast = Toast.makeText(this, "Başka tarif yok", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
