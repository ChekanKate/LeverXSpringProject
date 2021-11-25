package com.chekan.leverX.service;

import com.chekan.leverX.entity.Game;
import com.chekan.leverX.entity.User;

import java.util.List;

public interface GameService {
    public List<Game> getAllGames();
    public void saveGame(Game game);
}
