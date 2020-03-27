package de;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageRendererStandardImpl implements MessageRenderer{
    private Message message;

    public void printMessage() {
        System.out.println(message.getText());
    }
}
