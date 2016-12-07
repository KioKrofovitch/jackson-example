package com.kiodev.jacksonexample;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Class for handling File Input and Output
 */
public class FileIO {

  public String loadStringFromFile(Context context, String fileName) {
    String jsonString = "";

    try {
      InputStream inputStream = context.getAssets().open(fileName);
      int size = inputStream.available();
      byte[] buffer = new byte[size];

      inputStream.read(buffer);
      inputStream.close();

      String tempString = new String(buffer, "UTF-8");
      jsonString = new String(tempString.getBytes(), "UTF-8");
    } catch (IOException e) {
      e.printStackTrace();
    }

    return jsonString;
  }
}