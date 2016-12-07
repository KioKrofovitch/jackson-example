package com.kiodev.jacksonexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    public static final String ARTICUNO_JSON_FILE = "articuno.json";

    private ImageView pokemonImage;
    private TextView pokemonNameText;
    private TextView pokemonTypes;

    private Pokemon articuno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        loadData();

        displayData();
    }

    private void loadData(){
        FileIO fileIO = new FileIO();
        String jsonString = fileIO.loadStringFromFile(this, ARTICUNO_JSON_FILE);

        // Create Jackson ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Convert json string to object
        try {
            articuno = objectMapper.readValue(jsonString, Pokemon.class);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void displayData() {
        if (articuno == null) {
            return;
        }

        Picasso.with(this)
                .load(articuno.getSprites().getFrontShinyImgUrl())
                .placeholder(R.mipmap.ic_launcher)
                .into(pokemonImage);

        pokemonNameText.setText(articuno.getName());
        pokemonTypes.setText(formatTypes(articuno.getTypesList()));
    }

    private String formatTypes(ArrayList<PokemonFullType> types) {
        String typesFormatted = "";

        Collections.sort(types);

        for (PokemonFullType fullType : types) {
            typesFormatted += fullType.getType().getName() + "\n";
        }

        return typesFormatted;
    }

    private void initViews() {
        pokemonImage = (ImageView) findViewById(R.id.image_pokemon);
        pokemonNameText = (TextView) findViewById(R.id.text_name);
        pokemonTypes = (TextView) findViewById(R.id.text_types);
    }
}
