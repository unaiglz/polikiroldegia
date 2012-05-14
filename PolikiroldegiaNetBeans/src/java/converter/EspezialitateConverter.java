package converter;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import hibernate.*;
import pojo.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

public class EspezialitateConverter implements Converter {

    Session sesioa = HibernateKud.getInstance().getSession();
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
       
        org.hibernate.Transaction tx = null;
        ArrayList lista = new ArrayList();
        try {
            tx = sesioa.beginTransaction();
            System.out.println("Value="+value);
            Criteria add = HibernateKud.getInstance().getSession().createCriteria(Espezialitatea.class).add(Restrictions.eq("izena",value));
            System.out.println("Criteria="+add);
            tx.commit();
            lista = (ArrayList) add.list();
            if (lista.size() == 1) {
                System.out.println("Sartu da!!!! eta ondorengoa itzultzen du:"+(Espezialitatea) lista.get(0));
                return (Espezialitatea) lista.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        }
        return null;
        

    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
    
    
}
