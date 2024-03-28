package telran.blocker.dto;

import java.util.Objects;

public record IpData(String ip, String webService, long timestamp) {

	@Override
	public int hashCode() {
		return Objects.hash(ip, webService);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IpData other = (IpData) obj;
		return Objects.equals(ip, other.ip) && Objects.equals(webService, other.webService);
	}

}
