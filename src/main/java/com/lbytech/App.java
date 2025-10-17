package com.lbytech;

import dev.langchain4j.model.openai.OpenAiChatModel;


public class App {
    public static void main(String[] args) {
        // 读取环境配置
        String apiKey = System.getenv("openai.api.key");

        // 构建OpenAiChatModel对象
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("https://dashscope.aliyuncs.com/compatible-mode/v1")
                .modelName("qwen-plus")
                .apiKey(apiKey)
                .logRequests(true)
                .logResponses(true)
                .build();

        // 调用模型
        String response = model.chat("博哥帅不帅");
        System.out.println(response);
    }
}
