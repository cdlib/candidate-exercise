package cdlib.exercise.accordions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.io.ClassPathResource;

public class Application {

  public static void main(String[] args) {
    String tng = null;
    if (args.length >= 1) {
      tng = args[0];
    }
    File file;
    List<String> inputList;
    List<PianoAccordion> theList = null;
    ObjectMapper jsonMapper = new ObjectMapper();
    try {
      file = new ClassPathResource("inventory.json").getFile();
      inputList = Files.readAllLines(file.toPath());
      StringBuilder builder = new StringBuilder();
      for (String s : inputList) {
        builder.append(s);
      }
      theList = jsonMapper.readValue(builder.toString(), new TypeReference<List<PianoAccordion>>() {
      });
    } catch (Exception e) {
      e.printStackTrace();
    }
    List<PianoAccordion> result = new ArrayList<>();
    if (tng != null) {
      for (PianoAccordion p : theList) {
        if (p.tuning.equals(tng)) {
          result.add(p);
        }
      }
    } else {
      result = theList;
    }
    try {
      System.out.println(jsonMapper.writeValueAsString(result));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
  }
}
