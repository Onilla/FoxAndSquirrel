public enum Status {
    WIN("Вы победили!"), LOSE("Вы проиграли!"), IN_PROGRESS("Игра продолжается");

    private final String message;

    Status(String message) {
        this.message = message;
    }



    public String getMessage() {
        return message;
    }
}
