package br.com.alura.screenmatch.exception;

// extends de uma classe "unchecked", não é obrigatorio o try cacth
public class YearConversionException extends RuntimeException {
    private String message;

    public YearConversionException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
