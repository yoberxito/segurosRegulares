package essalud.gob.pe.segurostitulares.component;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@ControllerAdvice
public class FileUploadExceptionHandler {
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<Object> handleMaxUploadSizeExceededException(MaxUploadSizeExceededException ex) {
        String message = "Tamaño maximo de archivo excedido, Por favor seleccione un archivo menor o igual a 5MB";
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}
