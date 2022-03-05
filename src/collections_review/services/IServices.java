package collections_review.services;

import collections_review.models.Candidate;

import java.util.List;

public interface IServices {
    void add(Candidate candidate);
    List<Candidate> searching(String string);
}
