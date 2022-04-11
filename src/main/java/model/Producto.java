package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@Entity
@Table(name = "tb_productos")
public class Producto {

  @Id	
  @Column(name = "id_prod")
  private String IdProducto;
  
  @Column(name = "des_prod")
  private String descripcion;
  
  @Column(name = "stk_prod")
  private int stock;
  
  @Column(name = "pre_prod")
  private double precio;
  
  /*Para que al imprimir el cbo se immprima la la descripcion, se crea la clase normal y la otra clase viene del private de otra clase*/
  @ManyToOne
  @JoinColumn(name = "idcategoria", insertable = false, updatable = false) // 	para el listado inner join
  private Categoria categoria;
  
  private int idcategoria; //para grabar el producto
  
  
  @Column(name = "est_prod")
  private int estado;
  	
  
  @ManyToOne
  @JoinColumn(name = "idprovedor", insertable = false, updatable = false)
  private Proveedor idProveedor;

  private int idprovedor;
 
  
}