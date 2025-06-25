package br.com.alura.screenmatch.services.translator;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class TradutorGemini {

    public static String obterInformacao(String texto) {

        ChatLanguageModel gemini = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("OPENAI_GEMINI"))
                .modelName("gemini-1.5-flash")
                .build();

        String response = gemini.generate("Traduza o seguinte texto para o português " + texto);
        return response;
    }


}

