package com.provinciaseguro.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


/***
 * Class ComprobanteRequest : Información del comprobante a constatar.
 * @author  dgarcia
 * @version 1.0
 * @date    16/1/2023
 *
 */
@Entity 
@Table(name="comprobante_request")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ComprobanteRequest implements Serializable{

	/**
	 * Serial version
	 * @return
	 */
	private static final long serialVersionUID = -6224778655604648676L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "comprobante_modo" , length = 4)
	private String CbteModo; 
	
	@Column(name="cuit_emisor", length = 11)
	private int cuitEmisor;
	
	@Column(name="punto_venta", length = 4 )
	private int puntoVenta;
	
	@Column(name = "comprobante_tipo",  length = 3)
	private int CbteTipo;
	
	@Column(name = "comprobante_numero", length = 8)
	private long CbteNro;
	
	@Column(name="comprobante_fecha", length = 8)
	private String CbteFch;
	
	@Column(name="importe_total")
	private double ImpTotal;
	
	@Column(name="codigo_autorizacion" , length = 14)
	private String CodAutorizacion;
	
	@Column(name="coumento_tipo_receptor" , length = 2)
	private String DocTipoReceptor; 
	
	@Column(name="")
	
	
	
	
	
	
	
	
}
