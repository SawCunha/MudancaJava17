package br.com.sawcunha.textblock;

public class TextBlockMain {

    public static void main(String[] args) {
        System.out.println("Forma antiga de declarar texto utilizando o StringBuilder\n");
        textOld();
        System.out.println("\nNovo forma de declarar textos em blocks\n");
        textBlock();
    }

    private static void textOld() {
        StringBuilder text = new StringBuilder();

        text.append("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n");
        text.append("Habitant morbi tristique senectus et netus. Quis risus sed vulputate odio ut enim blandit. Adipiscing diam donec adipiscing tristique risus nec feugiat.\n");
        text.append("Leo vel orci porta non pulvinar neque. Laoreet suspendisse interdum consectetur libero id. Consequat id porta nibh venenatis cras sed felis eget velit.");

        System.out.println(text);
    }

    private static void textBlock() {
        System.out.println("""
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
                Habitant morbi tristique senectus et netus. Quis risus sed vulputate odio ut enim blandit. Adipiscing diam donec adipiscing tristique risus nec feugiat. 
                Leo vel orci porta non pulvinar neque. Laoreet suspendisse interdum consectetur libero id. Consequat id porta nibh venenatis cras sed felis eget velit. 
                Ut enim blandit volutpat maecenas volutpat blandit. Aliquam etiam erat velit scelerisque in dictum non consectetur a. Scelerisque fermentum dui faucibus in ornare quam. Lobortis feugiat vivamus at augue. 
                In arcu cursus euismod quis viverra. Ac tortor vitae purus faucibus ornare. Quis eleifend quam adipiscing vitae proin sagittis nisl rhoncus. Et odio pellentesque diam volutpat commodo sed egestas egestas. 
                Tempus imperdiet nulla malesuada pellentesque elit eget gravida.
                """);
    }


}
