package etap.beans;

public class EspecificacionTecnica{

        private Integer idEspecificacionTecnica;
        private int cantidad;
        private String cod_etap;

		public EspecificacionTecnica() {
		}

		public Integer getIdEspecificacionTecnica() {
			return idEspecificacionTecnica;
        }

        public void setIdEspecificacionTecnica(Integer idEspecificacionTecnica) {
        	this.idEspecificacionTecnica = idEspecificacionTecnica;
        }

		public int getCantidad() {
			return this.cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public String getCodEtap() {
			return cod_etap;
		}

		public void setCodEtap(String cod_etap) {
			this.cod_etap = cod_etap;
		}

}
