package pl.medapp.api.controller;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HomeController.class)
public class HomeControllerTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void hello() throws Exception {
//        mockMvc.perform(get("/registration"))
//            .andExpect(status().isOk())
//            .andExpect(view().name("registration_form"));
//    }
}