package cdlib.exercise.accordions;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Accordions class.
 *
 * This class has stuff about accordions.
 */
@RestController
public class Accordions {

  /**
   * RestController for the accordions list.
   *
   * @param tng the accordion type
   * @return the resulting list of accordions
   */
  @RequestMapping("/accordions")
  public List<PianoAccordion> thoseDarnAccordions(@RequestParam(value = "tuning", required = false) String tng) {
    File file;
    List<String> inputList;
    List<PianoAccordion> theList;
    try {
      file = new ClassPathResource("inventory.json").getFile();
      inputList = Files.readAllLines(file.toPath());
      StringBuilder builder = new StringBuilder();
      for (String s : inputList) {
        builder.append(s);
      }
      ObjectMapper jsonMapper = new ObjectMapper();
      theList = jsonMapper.readValue(builder.toString(), new TypeReference<List<PianoAccordion>>() {
      });
    } catch (Exception e) {
      e.printStackTrace();
      return null;
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
    return result;
  }
}
