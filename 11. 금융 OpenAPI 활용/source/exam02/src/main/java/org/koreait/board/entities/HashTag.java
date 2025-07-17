package org.koreait.board.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class HashTag {
    @Id
    private String tag;

    private String description;

    @ManyToMany(mappedBy = "tags")
    private List<BoardData> items;
}
