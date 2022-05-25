import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.InputDataDto;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws JsonProcessingException {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String readNextLine = scanner.nextLine();
            InputDataDto inputData = new ObjectMapper().readValue(readNextLine, InputDataDto.class);
        }
    }

}


