package com.example.test01.wishlist.controller;

import com.example.test01.wishlist.dto.WishListDto;
import com.example.test01.wishlist.service.WishListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
@RequiredArgsConstructor
public class ApiController {

    private final WishListService wishListService;

    @GetMapping("/all")
    public List<WishListDto> findAll(){
        return wishListService.findAll();
    }

    @GetMapping("/search")
    public WishListDto findByKeyWord(@RequestParam String query){
        return wishListService.findByKeyWord(query);
    }

    @PostMapping("")
    public WishListDto save(@RequestBody WishListDto wishListDto){
        return wishListService.save(wishListDto);
    }

    @DeleteMapping("/{index}")
    public void delete(@PathVariable(name ="index") Long id){
        wishListService.delete(id);
    }

    @PostMapping("/{index}")
    public void addVisit(@PathVariable(name ="index") Long id){
        wishListService.addVisit(id);
    }

}
