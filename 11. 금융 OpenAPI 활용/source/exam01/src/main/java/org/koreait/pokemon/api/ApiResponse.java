package org.koreait.pokemon.api;

import lombok.Data;

import java.util.List;

@Data
public class ApiResponse {
    private int count;
    private String next;
    private String previous;
    private List<UrlItem> results;
}
