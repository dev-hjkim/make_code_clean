package com.example.practice.clean.util.mock;

public class PageData {
    private WikiPage wikiPage;
    private String content;
    private String html;

    public WikiPage getWikiPage() {
        return this.wikiPage;
    }

    public boolean hasAttribute(String test) {
        return true;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtml() {
        return this.html;
    }
}
