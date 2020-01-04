package l2.blog.controller.admin;

import l2.blog.crud.MenuCrud;
import l2.blog.entity.Menu;
import l2.blog.model.MenuModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/menu")
public class MenuAdminController {

    @Autowired
    MenuCrud menuCrud;

    @GetMapping
    public ResponseEntity<Object> getAll(){
        Iterable<Menu> list= menuCrud.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody MenuModel model) throws IOException {
        //


        Map<String,Object> res=new HashMap<>();
        Menu menu=new Menu();
        menu.setTenhienthi(model.getTenhienthi());
        menu.setNgaytao(new Date());
        try{
            Menu result=menuCrud.save(menu);
            res.put("status","ok");
            res.put("result",menu);
        }catch (Exception e){
            res.put("status","bad");
            res.put("message",e.getMessage());
        }
        return ResponseEntity.ok().body(res);
    }


    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody MenuModel model){
        Map<String,Object> res=new HashMap<>();
        Menu menu=new Menu();
        menu.setId(model.getId());
        menu.setNgaytao(new Date());
        System.out.println(menu.getTenhienthi());
        try{
            menuCrud.delete(menu);
            res.put("status","ok");
            res.put("result",menu.getId());
        }catch (Exception e){
            res.put("status","bad");
            res.put("message",e.getMessage());
        }
        return ResponseEntity.ok().body(res);
    }
}
