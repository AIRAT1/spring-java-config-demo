package de;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageRendererErrorImpl implements MessageRenderer{
    private Message message;

    public void printMessage() {
        System.err.println(message.getText());
    }
}
