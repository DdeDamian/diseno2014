package disenio2014.web;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import disenio2014.service.SimpleProductManager;
import disenio2014.web.InventoryController;
import junit.framework.TestCase;
import disenio2014.domain.Product;
import disenio2014.repository.InMemoryProductDao;

public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{
        InventoryController controller = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
        controller.setProductManager(spm);
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}