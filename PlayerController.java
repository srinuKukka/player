/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import com.example.player.Player;
import com.example.player.PlayerService;

@RestController
public class PlayerController {
  PlayerService playerService = new PlayerService();

  @GetMapping("/players")
  public ArrayList<Player> getPlayers() {
    return playerService.getPlayers();
  }

  @GetMapping("/players/{playerId}")
  public Player getPlayerById(@PathVariable("playerId") int playerId) {
    return playerService.getPlayerById(playerId);
  }

  @PostMapping("/players")
  public Player addPlayer(@RequestBody Player player) {
    return playerService.addPlayer(player);
  }

  @PutMapping("/player/{playerId}")
  public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player){
      return playerService.updatePlayer(playerId,player);
  } 
  @DeleteMapping("/player/{playerId}")
  public void deletePlayer(@PathVariable("playerId") int playerId){
       playerService.deletePlayer(playerId);
  } 

 
}
